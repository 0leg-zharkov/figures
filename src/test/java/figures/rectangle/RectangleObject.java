package figures.rectangle;

import figures.Rectangle;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class RectangleObject {

    protected Rectangle getTwoDRectangle() {
        Point pointA = new Point("0 0");
        Point pointB = new Point("0 1");
        Point pointC = new Point("2 1");
        Point pointD = new Point("2 0");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        points.add(pointD);
        return new Rectangle(points);
    }

    protected Rectangle getThreeDRectangle() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 1 0");
        Point pointC = new Point("2 1 1");
        Point pointD = new Point("2 0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        points.add(pointD);
        return new Rectangle(points);
    }
}
