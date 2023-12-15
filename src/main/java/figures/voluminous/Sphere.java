package figures.voluminous;

import figures.Figure;
import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Sphere extends Figure {

    private Point pointA;
    private Point pointB;
    private double radius;

    public Sphere(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        isAmount = points.size() == TWO;
        radius = section(pointA, pointB);
    }

    public void coordinates() {
        boolean wrongCoords = checkIsDot(pointA, pointB);
        isValid = !wrongCoords || !isAmount;
        coordinates(wrongCoords ? INVALID : VALID);
    }

    public void square() {
        double sq = FOUR * Math.pow(radius, VOZV) * Math.PI;
        square(sq);
    }
}
