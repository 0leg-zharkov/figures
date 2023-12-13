package figures.parallelogram;

import figures.Parallelogram;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class ParallelogramObject {

    protected Parallelogram getParalellogramTwoD() {
        Point pointA = new Point("0 0");
        Point pointB = new Point("1 1");
        Point pointC = new Point("2 1");
        Point pointD = new Point("1 0");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        points.add(pointD);
        return new Parallelogram(points);
    }

    protected Parallelogram getParalellogramThreeD() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("1 1 0");
        Point pointC = new Point("2 1 1");
        Point pointD = new Point("1 0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        points.add(pointD);
        return new Parallelogram(points);
    }
}
