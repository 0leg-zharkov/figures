package figures.voluminous;

import figures.Figure;
import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Sphere extends Figure {

    private Point pointA;
    private Point pointB;
    private double r;

    public Sphere(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        r = super.section(pointA, pointB);
    }

    @Override
    public void coordinates() {
        boolean wrongCoords = checkIsDot(pointA, pointB);
        isValid = !wrongCoords;
        super.coordinates(wrongCoords ? INVALID : VALID);
    }

    @Override
    public void square() {
        double sq = FOUR * Math.pow(r, VOZV) * Math.PI;
        super.square(sq);
    }

    @Override
    public void perimeter() {
        super.perimeter();
    }
}
