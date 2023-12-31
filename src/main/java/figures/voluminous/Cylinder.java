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
        for (Point point : points) {
            if (point.len() == TWO) {
                checkLen = false;
                break;
            }
        }
    }

    @Override
    public void coordinates() {

        boolean isDot = checkIsDot(pointA, pointB, pointC);
        boolean isNinetyDegree = isDown ? isRightAngle(pointA, pointB, pointC) : isRightAngle(pointB, pointA, pointC);
        boolean isCircle = checkIsDot(pointA, pointB);
        boolean isConeUp = checkIsDot(pointA, pointC);
        boolean isConeDown = checkIsDot(pointB, pointC);
        boolean check = isDot || !isNinetyDegree || isCircle || isConeUp || isConeDown;
        isValid = !check && isAmount && checkLen;
        coordinates(isValid ? VALID : INVALID);
    }

    @Override
    public void square() {
        double radius = isDown ? section(pointA, pointC) : section(pointB, pointC);
        double circlesSquare = TWO * Math.PI * Math.pow(radius, TWO);
        double sq = circlesSquare + TWO * Math.PI * section(pointA, pointB) * radius;
        square(sq);
    }
}
