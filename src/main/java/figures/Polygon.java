package figures;

import point.Point;

import java.util.ArrayList;
import java.util.List;

import static nums.AllNums.*;

public class Polygon extends Figure {

    private List<Point> points = new ArrayList<>();

    public Polygon(List<Point> points) {
        this.points = points;
        isValid = points.size() >= THREE;
    }

    @Override
    public void coordinates() {
        coordinates(isValid ? VALID : INVALID);
    }

    @Override
    public void square() {
        if (!isValid) {
            super.square();
        } else {
            double sq = 0;
            for (int i = 1; i < points.size() - 1; i++) {
                List<Point> trianlgePoints = new ArrayList<>();
                trianlgePoints.add(points.get(0));
                trianlgePoints.add(points.get(i));
                trianlgePoints.add(points.get(i + 1));
                Triangle triangle = new Triangle(trianlgePoints);
                sq += triangle.getSquare();
                trianlgePoints.clear();
            }
            square(sq);
        }
    }

    @Override
    public void perimeter() {
        if (isValid) {
            double per = 0;
            for (int i = 0; i < points.size() - 1; i++) {
                per += section(points.get(i), points.get(i + 1));
            }
            per += section(points.get(0), points.get(points.size() - 1));
            perimeter(per);
        } else {
            super.perimeter();
        }
    }
}
