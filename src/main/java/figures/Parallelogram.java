package figures;

import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Parallelogram extends Figure {

    protected Point pointA;
    protected Point pointB;
    protected Point pointC;
    protected Point pointD;
    protected double sq;

    public Parallelogram(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        pointC = points.get(2);
        pointD = points.get(3);
        isAmount = points.size() == FOUR;
    }

    @Override
    public void square() {
        double diag = section(pointB, pointD);
        double AB = section(pointA, pointB);
        double DA = section(pointB, pointC);
        double semiPer = (diag + AB + DA) / 2;
        sq = TWO * Math.sqrt(semiPer * (semiPer - diag) * (semiPer - AB) * (semiPer - DA));
        square(sq);
    }

    @Override
    public void coordinates() {
        boolean areSidesEqls = section(pointA, pointB) == section(pointC, pointD)
                && section(pointB, pointC) == section(pointD, pointA);
        boolean areSidesParrallel = isParallel(pointA, pointB, pointD, pointC);
        boolean check = areSidesEqls && areSidesParrallel;
        isValid = check && isAmount;
        coordinates(isValid ? VALID : INVALID);
    }

    @Override
    public void perimeter() {
        double per = section(pointA, pointB) + section(pointB, pointC)
                + section(pointC, pointD)
                + section(pointD, pointA);
        perimeter(per);
    }

    protected boolean returnDiag() {
        return section(pointA, pointC) == section(pointB, pointD);
    }
}
