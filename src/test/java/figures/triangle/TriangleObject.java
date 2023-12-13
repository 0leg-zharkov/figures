package figures.triangle;

import figures.Triangle;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class TriangleObject {
    protected Triangle getTwoDTriangle() {
        Point pointA = new Point("0 0");
        Point pointB = new Point("0 1");
        Point pointC = new Point("1 0");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Triangle(points);
    }

    protected Triangle getThreeDTriangle() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 1 0");
        Point pointC = new Point("1 0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Triangle(points);
    }
}
