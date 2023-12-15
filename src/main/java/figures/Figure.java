package figures;

import point.Point;

import java.util.Date;
import java.util.List;

import static nums.AllNums.*;

public class Figure {

    protected boolean isValid = true;
    protected boolean isAmount;

    public void coordinates(String validation) {
        System.out.printf("The figure is %s \n", validation);
    }

    public void coordinates() {
        System.out.println("The figure is figure");
    }

    public void square() {
        System.out.println("The figure has no area");
    }

    public void square(double sq) {
        System.out.printf("The figure area %.2f \n", sq);
    }

    public void perimeter() {
        System.out.println("The figure has no perimeter");
    }

    public void perimeter(double per) {
        System.out.printf("The figure perimeter %.2f \n", per);
    }

    protected double section(Point pointA, Point pointB) {
        double xDist = Math.pow(pointA.x() - pointB.x(), VOZV);
        double yDist = Math.pow(pointA.y() - pointB.y(), VOZV);
        double zDist = Math.pow(pointA.z() - pointB.z(), VOZV);
        double section = Math.sqrt(xDist + yDist + zDist);
        return section;
    }

    protected boolean isRightAngle(Point pointA, Point pointB, Point pointC) {
        double ABx = pointB.x() - pointA.x();
        double ABy = pointB.y() - pointA.y();
        double ABz = pointB.z() - pointA.z();
        double ACx = pointC.x() - pointA.x();
        double ACy = pointC.y() - pointA.y();
        double ACz = pointC.z() - pointA.z();
        double angle = ABx * ACx + ABy * ACy + ABz * ACz;
        return angle == 0;
    }

    protected boolean isParallel(Point pointA, Point pointB, Point pointC, Point pointD) {
        double ABx = pointB.x() - pointA.x();
        double ABy = pointB.y() - pointA.y();
        double ABz = pointB.z() - pointA.z();
        double CDx = pointC.x() - pointD.x();
        double CDy = pointC.y() - pointD.y();
        double CDz = pointC.z() - pointD.z();
        return ABx / CDx == ABy / CDy && ABx / CDx == ABz / CDz;
    }

    protected boolean checkIsDot(Point pointA, Point pointB, Point pointC) {
        return pointA.x() == pointB.x() && pointA.x() == pointC.x()
                && pointA.y() == pointB.y() && pointA.y() == pointC.y()
                && pointA.z() == pointB.z() && pointA.z() == pointC.z();
    }

    protected boolean checkIsDot(Point pointA, Point pointB) {
        return pointA.x() == pointB.x() && pointA.y() == pointB.y() && pointA.z() == pointB.z();
    }

    public boolean isValid() {
        return isValid;
    }
}
