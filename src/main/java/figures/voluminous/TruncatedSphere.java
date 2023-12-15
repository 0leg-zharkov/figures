package figures.voluminous;

import figures.Figure;
import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class TruncatedSphere extends Figure {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double radius;
    private double height;

    public TruncatedSphere(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        pointC = points.get(2);
        radius = section(pointA, pointB);
        isAmount = points.size() == THREE;
        height = radius - Math.abs(pointC.z());
    }

    public void coordinates() {
        boolean isDot = checkIsDot(pointA, pointB, pointC);
        boolean isCircle = pointA.x() == pointB.x() && pointA.y() == pointB.y() && pointA.z() == pointB.z();
        boolean isSection = pointA.x() == pointC.x() && pointA.y() == pointC.y() && pointA.z() == pointC.z();
        boolean check = isCircle || isDot || isSection;
        isValid = !check || !isAmount;
        super.coordinates(check ? INVALID : VALID);
    }

    public void square() {
        double sq = TWO * Math.PI * radius * height;
        super.square(sq);
    }
}
