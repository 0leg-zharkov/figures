package figures;

import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Circle extends Figure {

    private Point pointA;
    private Point pointB;
    double radius;

    public Circle(List<Point> points) {
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
        double sq = Math.pow(radius, VOZV) * Math.PI;
        square(sq);
    }

    public void perimeter() {
        double per = TWO * Math.PI * radius;
        perimeter(per);
    }
}
