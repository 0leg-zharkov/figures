package figures.voluminous.cone;

import figures.voluminous.Cone;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class ConeObject {

    protected Cone getCone() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 1 0");
        Point pointC = new Point("0 0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Cone(points);
    }
}
