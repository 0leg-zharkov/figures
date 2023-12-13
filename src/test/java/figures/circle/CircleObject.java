package figures.circle;

import figures.Circle;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class CircleObject {

    protected Circle getCircleTwoD() {
        Point pointA = new Point("0 0");
        Point pointB = new Point("0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        return new Circle(points);
    }

    protected Circle getCircleThreeD() {
        Point pointA = new Point("0 0 7");
        Point pointB = new Point("1 1 6");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        return new Circle(points);
    }
}
