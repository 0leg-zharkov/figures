package figures;

import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Square extends Parallelogram {

    public Square(List<Point> points) {
        super(points);
    }

    @Override
    public void coordinates() {
        boolean isDiagEqls = returnDiag();
        boolean areAllSidesEqls = section(pointA, pointB) == section(pointB, pointC)
                 && section(pointB, pointC) == section(pointC, pointD)
                 && section(pointC, pointD) == section(pointD, pointA);
        boolean isNinetyDegree = isRightAngle(pointA, pointB, pointD);
        boolean check = isDiagEqls && areAllSidesEqls && isNinetyDegree;
        isValid = check && isAmount;
        coordinates(isValid ? VALID : INVALID);
    }
}
