import figures.*;
import figures.voluminous.*;
import point.Point;

import javax.swing.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static final Pattern p = Pattern.compile("(\\d\\s\\d)(\\s\\d)?");
    static Scanner scanner = new Scanner(System.in);
    //не забыть отчистить список
    static List<Point> points = new ArrayList<>();

    public static void main(String[] args) {

        checkInput();
    }

    public static void checkInput() {
        String input;
        while (true) {
            input = scanner.nextLine();
            if (input.equals("END")) {
                break;
            }
            inputCoords();
            if (points.size() == 0) {
                continue;
            }
            output(input);
        }
    }

    public static void inputCoords() {
        Matcher m;
        String coord;
        boolean checkInput = true;
        while (true) {
            coord = scanner.nextLine();
            if (checkInput) {
                checkInput = true;
            }
            if (coord.equals("STOP_INPUT")) {
                if (!checkInput) {
                    System.out.println("The figure is invalid \nplease, retype");
                    points.clear();
                }
                break;
            }
            m = p.matcher(coord);
            if (m.matches()) {
                Point point = new Point(coord);
                points.add(point);
            } else {
                checkInput = false;
            }
        }
    }

    public static void output(String type) {
        Figure figure = new Figure();
        switch (type) {
            case "CIRCLE":
                figure = new Circle(points);
                break;
            case "SQUARE":
                figure = new Square(points);
                break;
            case "RECTANGLE":
                figure = new Rectangle(points);
                break;
            case "TRIANGLE":
                figure = new Triangle(points);
                break;
            case "PARALLELOGRAM":
                figure = new Parallelogram(points);
                break;
            case "FIGURE":
                figure = new Figure();
                break;
            case "SPHERE":
                figure = new Sphere(points);
                break;
            case "TRUNCATED_SPHERE":
                figure = new TruncatedSphere(points);
                break;
            case "CYLINDER":
                figure = new Cylinder(points);
                break;
            case "CONE":
                figure = new Cone(points);
                break;
            case "POLYGON":
                figure = new Polygon(points);
                break;
        }
        countingOutput(figure, type);
        points.clear();
    }

    public static void countingOutput(Figure figure, String type) {

        figure.coordinates();
        if (figure.isValid()) {
            figure.square();
            figure.perimeter();
        } else {
            System.out.println("Please, retype");
            points.clear();
        }
    }
}