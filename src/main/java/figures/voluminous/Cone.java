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
        for (Point point : points) {
            if (point.len() == TWO) {
                checkLen = false;
                break;
            }
        }
        isAmount = points.size() == THREE;
    }

    public void coordinates() {
        boolean isDot = checkIsDot(pointA, pointB, pointC);
        boolean isSection = checkIsDot(pointA, pointB);
        boolean isCircle = checkIsDot(pointA, pointC);
        boolean isNinetyDegree = isRightAngle(pointA, pointB, pointC);
        boolean check = isDot || isSection || isCircle || !isNinetyDegree;
        isValid = !check && isAmount && checkLen;
        coordinates(isValid ? VALID : INVALID);
    }

    public void square() {
        double radius = section(pointA, pointB);
        double obrazuyush = section(pointC, pointB);
        double sq = Math.PI * radius * (radius + obrazuyush);
        square(sq);
    }
}
