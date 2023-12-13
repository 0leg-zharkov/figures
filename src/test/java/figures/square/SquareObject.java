package figures.square;

import figures.Square;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class SquareObject {

    protected Square getTwoDSquare() {
        Point pointA = new Point("0 0");
        Point pointB = new Point("0 1");
        Point pointC = new Point("1 1");
        Point pointD = new Point("1 0");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        points.add(pointD);
        return new Square(points);
    }

    protected Square getThreeDSquare() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 1 0");
        Point pointC = new Point("0 1 1");
        Point pointD = new Point("0 0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        points.add(pointD);
        return new Square(points);
    }
}
