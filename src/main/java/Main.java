import figures.*;
import figures.voluminous.*;
import point.Point;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {

    static final Pattern p = Pattern.compile("(-?\\d+\\s-?\\d+)(\\s-?\\d+)?");
    static Scanner scanner = new Scanner(System.in);
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
                System.out.println("please, retype");
                continue;
            }
            output(input);
        }
    }

    public static void inputCoords() {
        Matcher m;
        String coord;
        boolean isWellInputed = true;
        while (true) {
            coord = scanner.nextLine();
            if (!coord.equals("STOP_INPUT") && isWellInputed) {
                m = p.matcher(coord);
                if (m.matches()) {
                    Point point = new Point(coord);
                    points.add(point);
                } else {
                    isWellInputed = false;
                    points.clear();
                }
            } else if (coord.equals("STOP_INPUT")) {
                break;
            }
        }
    }

    public static void output(String type) {

        Figure figure = switch (type) {
            case "CIRCLE" -> new Circle(points);
            case "SQUARE" -> new Square(points);
            case "RECTANGLE" -> new Rectangle(points);
            case "TRIANGLE" -> new Triangle(points);
            case "PARALLELOGRAM" -> new Parallelogram(points);
            case "FIGURE" -> new Figure();
            case "SPHERE" -> new Sphere(points);
            case "TRUNCATED_SPHERE" -> new TruncatedSphere(points);
            case "CYLINDER" -> new Cylinder(points);
            case "CONE" -> new Cone(points);
            case "POLYGON" -> new Polygon(points);
            default -> null;
        };
        if (figure == null) {
            System.out.println("please, retype");
            return;
        }
        countingOutput(figure);
        points.clear();
    }

    public static void countingOutput(Figure figure) {

        figure.coordinates();
        if (figure.isValid()) {
            figure.square();
            figure.perimeter();
        }
        points.clear();
    }
}