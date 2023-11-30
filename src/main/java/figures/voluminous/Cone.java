package figures.voluminous;

import figures.Figure;
import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Cone extends Figure {

    private Point pointA;
    private Point pointB;
    private Point pointC;

    public Cone(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        pointC = points.get(2);
    }

    @Override
    public void coordinates() {
        boolean isDot = super.checkIsDot(pointA, pointB, pointC);
        boolean isSection = super.checkIsDot(pointA, pointB);
        boolean isCircle = super.checkIsDot(pointA, pointC);
        boolean isNinetyDegree = super.isRightAngle(pointA, pointB, pointC);
        boolean check = isDot || isSection || isCircle || !isNinetyDegree;
        super.isValid = !check;
        super.coordinates(check ? INVALID : VALID);
    }

    @Override
    public void square() {
        double r = super.section(pointA, pointB);
        double obrazuyush = super.section(pointC, pointB);
        double sq = Math.PI * r * (r + obrazuyush);
        super.square(sq);
    }

    @Override
    public void perimeter() {
        super.perimeter();
    }
}
