package figures;

import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Rectangle extends Parallelogram {

    public Rectangle(List<Point> points) {
        super(points);
    }

    @Override
    public void coordinates() {
        boolean diag = returnDiag();
        boolean areSidesEqls = section(pointA, pointB) == section(pointC, pointD)
                && section(pointB, pointC) == section(pointD, pointA);
        boolean isNinetyDegree = isRightAngle(pointA, pointB, pointD);
        boolean check = diag && areSidesEqls && isNinetyDegree;
        isValid = check && isAmount;
        coordinates(isValid ? VALID : INVALID);
    }
}
