package figures;

import point.Point;

import java.util.ArrayList;
import java.util.List;

import static nums.AllNums.*;

public class Square extends Figure {

    protected Point pointA;
    protected Point pointB;
    protected Point pointC;
    protected Point pointD;

    public Square(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        pointC = points.get(2);
        pointD = points.get(3);
    }

    @Override
    public void coordinates() {
        boolean isDiagEqls = returnDiag();
        boolean areAllSidesEqls = section(pointA, pointB) == section(pointB, pointC)
                 && section(pointB, pointC) == section(pointC, pointD)
                 && section(pointC, pointD) == section(pointD, pointA);
        boolean isNinetyDegree = isRightAngle(pointA, pointB, pointD);
        boolean check = isDiagEqls && areAllSidesEqls && isNinetyDegree;
        isValid = check;
        super.coordinates(check ? VALID : INVALID);
    }

    @Override
    public void square() {
        double sq = super.section(pointA, pointB) * super.section(pointA, pointB);
        super.square(sq);
    }

    @Override
    public void perimeter() {
        double per = super.section(pointA, pointB) + super.section(pointB, pointC)
                + super.section(pointC, pointD)
                + super.section(pointD, pointA);
        super.perimeter(per);
    }

    protected boolean returnDiag() {
        return super.section(pointA, pointC) == super.section(pointB, pointD);
    }
}
