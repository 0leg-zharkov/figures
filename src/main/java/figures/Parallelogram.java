package figures;

import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Parallelogram extends Square {
    public Parallelogram(List<Point> points) {
        super(points);
    }

    @Override
    public void coordinates() {
        boolean diag = !returnDiag();
        boolean areSidesEqls = section(pointA, pointB) == section(pointC, pointD)
                && section(pointB, pointC) == section(pointD, pointA);
        boolean isNinetyDegree = !isRightAngle(pointA, pointB, pointD);
        boolean check = diag && areSidesEqls && isNinetyDegree;
        isValid = check;
        super.coordinates(check ? VALID : INVALID);
    }

    @Override
    public void square() {
        double diag = section(pointB, pointD);
        double AB = section(pointA, pointB);
        double DA = section(pointB, pointC);
        double semiPer = (diag + AB + DA) / 2;
        double sq = TWO * Math.sqrt(semiPer * (semiPer - diag) * (semiPer - AB) * (semiPer - DA));
        super.square(sq);
    }

    @Override
    public void perimeter() {
        super.perimeter();
    }
}
