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
        for (Point point : points) {
            if (point.len() == TWO) {
                checkLen = false;
                break;
            }
        }
        height = radius - Math.abs(pointC.z());
    }

    public void coordinates() {
        boolean isDot = checkIsDot(pointA, pointB, pointC);
        boolean isCircle = checkIsDot(pointA, pointB);
        boolean isSection = checkIsDot(pointA, pointC);
        boolean check = isCircle || isDot || isSection;
        isValid = !check && isAmount && checkLen;
        super.coordinates(isValid ? VALID : INVALID);
    }

    public void square() {
        double sq = TWO * Math.PI * radius * height;
        super.square(sq);
    }
}
