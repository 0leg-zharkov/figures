package figures.voluminous;

import figures.Circle;
import figures.Figure;
import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Sphere extends Circle {

    public Sphere(List<Point> points) {
        super(points);
        for (Point point : points) {
            if (point.len() == TWO) {
                checkLen = false;
                break;
            }
        }
    }

    @Override
    public void coordinates() {
        boolean wrongCoords = checkIsDot(pointA, pointB);
        isValid = !(wrongCoords || !isAmount || !checkLen);
        coordinates(isValid ? VALID : INVALID);
    }

    @Override
    public void square() {
        double sq = FOUR * Math.pow(radius, VOZV) * Math.PI;
        square(sq);
    }
}
