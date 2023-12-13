package figures.voluminous.sphere;

import figures.voluminous.Sphere;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class SphereObject {

    protected Sphere getSphere() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 0 2");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        return new Sphere(points);
    }
}
