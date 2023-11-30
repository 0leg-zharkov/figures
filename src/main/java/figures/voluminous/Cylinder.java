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
        isDown = pointA.z() == pointC.z();
    }

    @Override
    public void coordinates() {

        boolean isDot = super.checkIsDot(pointA, pointB, pointC);
        boolean isNinetyDegree = isDown ? isRightAngle(pointA, pointB, pointC) : isRightAngle(pointB, pointA, pointC);
        boolean isCircle = pointA.x() == pointB.x()
                && pointA.y() == pointB.y()
                && pointA.z() == pointB.z();
        boolean isConeUp = super.checkIsDot(pointA, pointC);
        boolean isConeDown = super.checkIsDot(pointB, pointC);
        boolean check = isDot || !isNinetyDegree || isCircle || isConeUp || isConeDown;
        isValid = !check;
        super.coordinates(check ? INVALID : VALID);
    }

    @Override
    public void square() {
        double r = isDown ? super.section(pointA, pointC) : super.section(pointB, pointC);
        double circlesSquare = TWO * Math.PI * Math.pow(r, TWO);
        double sq = circlesSquare + TWO * Math.PI * super.section(pointA, pointB) * r;
        super.square(sq);
    }

    @Override
    public void perimeter() {
        super.perimeter();
    }
}
