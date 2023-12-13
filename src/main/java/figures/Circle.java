package figures;

import point.Point;

import java.util.ArrayList;
import java.util.List;

import static nums.AllNums.*;

public class Circle extends Figure {

    private Point pointA;
    private Point pointB;
    double r;

    public Circle(List<Point> points) {
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
        double sq = Math.pow(r, VOZV) * Math.PI;
        super.square(sq);
    }

    @Override
    public void perimeter() {
        double per = TWO * Math.PI * r;
        super.perimeter(per);
    }
}
