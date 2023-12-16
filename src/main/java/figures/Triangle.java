package figures;

import point.Point;

import java.util.List;

import static nums.AllNums.*;

public class Triangle extends Figure {

    private Point pointA;
    private Point pointB;
    private Point pointC;
    private double ABSide;
    private double BCSide;
    private double CASide;
    private double perimeter;
    private double sq;

    public Triangle(List<Point> points) {
        pointA = points.get(0);
        pointB = points.get(1);
        pointC = points.get(2);
        isAmount = points.size() == 3;
        ABSide = section(pointA, pointB);
        BCSide = section(pointB, pointC);
        CASide = section(pointC, pointA);
        perimeter = ABSide + BCSide + CASide;
    }
    
    public void coordinates() {
        boolean isWrongCoords = checkIsDot(pointA, pointB, pointC);
        boolean checkSides = ABSide < BCSide + CASide
                && BCSide < ABSide + CASide
                && CASide < ABSide + BCSide;
        boolean check = checkSides && !isWrongCoords;
        isValid = check && isAmount;
        coordinates(isValid ? VALID : INVALID);
    }

    public void square() {
        sq = getSquare();
        square(sq);
    }

    public double getSquare() {
        double poluperimeter = perimeter / 2;
        sq = Math.sqrt(poluperimeter
                * (poluperimeter - ABSide) * (poluperimeter - BCSide) * (poluperimeter - CASide));
        return sq;
    }

    public void perimeter() {
        perimeter(perimeter);
    }
}
