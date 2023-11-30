package figures.voluminous;

import figures.Figure;
import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class TruncatedSphere extends Figure {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double r;
    private double h;

    public TruncatedSphere(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        pointC = points.get(2);
        r = super.section(pointA, pointB);
        h = r - Math.abs(pointC.z());
    }

    @Override
    public void coordinates() {
        boolean isDot = super.checkIsDot(pointA, pointB, pointC);
        boolean isCircle = pointA.x() == pointB.x() && pointA.y() == pointB.y() && pointA.z() == pointB.z();
        boolean isSection = pointA.x() == pointC.x() && pointA.y() == pointC.y() && pointA.z() == pointC.z();
        boolean check = isCircle || isDot || isSection;
        isValid = !check;
        super.coordinates(check ? INVALID : VALID);
    }

    @Override
    public void square() {
        double sq = TWO * Math.PI * r * h;
        super.square(sq);
    }

    @Override
    public void perimeter() {
        super.perimeter();
    }
}
