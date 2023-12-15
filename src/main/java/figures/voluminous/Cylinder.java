package figures.voluminous;

import figures.Figure;
import point.Point;

import java.util.ArrayList;
import java.util.List;

import static nums.AllNums.*;

public class Cylinder extends Figure {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private boolean isDown;

    public Cylinder(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        pointC = points.get(2);
        isAmount = points.size() == THREE;
        isDown = pointA.z() == pointC.z();
    }

    public void coordinates() {

        boolean isDot = checkIsDot(pointA, pointB, pointC);
        boolean isNinetyDegree = isDown ? isRightAngle(pointA, pointB, pointC) : isRightAngle(pointB, pointA, pointC);
        boolean isCircle = pointA.x() == pointB.x()
                && pointA.y() == pointB.y()
                && pointA.z() == pointB.z();
        boolean isConeUp = checkIsDot(pointA, pointC);
        boolean isConeDown = checkIsDot(pointB, pointC);
        boolean check = isDot || !isNinetyDegree || isCircle || isConeUp || isConeDown;
        isValid = !check || !isAmount;
        coordinates(check ? INVALID : VALID);
    }

    public void square() {
        double radius = isDown ? section(pointA, pointC) : section(pointB, pointC);
        double circlesSquare = TWO * Math.PI * Math.pow(radius, TWO);
        double sq = circlesSquare + TWO * Math.PI * section(pointA, pointB) * radius;
        square(sq);
    }
}
