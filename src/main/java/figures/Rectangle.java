package figures;

import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Rectangle extends Square {

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public void coordinates() {
        boolean diag = super.returnDiag();
        boolean areSidesEqls = super.section(pointA, pointB) == super.section(pointC, pointD)
                && super.section(pointB, pointC) == super.section(pointD, pointA);
        boolean isNinetyDegree = isRightAngle(pointA, pointB, pointD);
        boolean check = diag && areSidesEqls &&isNinetyDegree;
        isValid = check;
        super.coordinates(check ? VALID : INVALID);
    }

    @Override
    public void square() {
        double sq = super.section(pointA, pointB) * super.section(pointB, pointC);
        super.square(sq);
    }

    @Override
    public void perimeter() {
        super.perimeter();
    }
}
