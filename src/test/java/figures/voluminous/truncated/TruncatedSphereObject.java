package figures.voluminous.truncated;

import figures.voluminous.TruncatedSphere;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class TruncatedSphereObject {

    protected TruncatedSphere getTruncatedSphere() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 0 3");
        Point pointC = new Point("0 0 2");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new TruncatedSphere(points);
    }
}
