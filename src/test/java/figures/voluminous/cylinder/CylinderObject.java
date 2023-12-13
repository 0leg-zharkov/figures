package figures.voluminous.cylinder;

import figures.voluminous.Cylinder;
import point.Point;

import java.util.ArrayList;
import java.util.List;

public class CylinderObject {

    protected Cylinder getCylinder() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 0 2");
        Point pointC = new Point("1 0 0");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Cylinder(points);
    }
}
