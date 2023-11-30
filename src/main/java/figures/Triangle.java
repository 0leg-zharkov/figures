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
        ABSide = super.section(pointA, pointB);
        BCSide = super.section(pointB, pointC);
        CASide = super.section(pointC, pointA);
        perimeter = ABSide + BCSide + CASide;
    }

    @Override
    public void coordinates() {
        boolean isWrongCoords = pointA.x() == pointB.x()
                && pointA.y() == pointB.y()
                && pointB.x() == pointC.x();
        boolean checkSides = ABSide < BCSide + CASide
                && BCSide < ABSide + CASide
                && CASide < ABSide + BCSide;
        boolean check = checkSides && !isWrongCoords;
        isValid = check;
        super.coordinates(check ? VALID : INVALID);
    }

    @Override
    public void square() {
        double poluperimeter = perimeter / 2;
        sq = Math.sqrt(poluperimeter
                * (poluperimeter - ABSide) * (poluperimeter - BCSide) * (poluperimeter - CASide));
        super.square(sq);
    }

    public double getSquare() {
        double poluperimeter = perimeter / 2;
        sq = Math.sqrt(poluperimeter
                * (poluperimeter - ABSide) * (poluperimeter - BCSide) * (poluperimeter - CASide));
        return sq;
    }

    @Override
    public void perimeter() {
        super.perimeter(perimeter);
    }
}
