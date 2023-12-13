package figures.polygon;

import figures.Polygon;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class PolygonObject {

    protected Polygon getTwoDPolygon() {
        Point pointA = new Point("0 0");
        Point pointB = new Point("0 1");
        Point pointC = new Point("2 0");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Polygon(points);
    }

    protected Polygon getThreeDPolygon() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 1 0");
        Point pointC = new Point("2 0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Polygon(points);
    }
}
