package figures.voluminous.cylinder;

import figures.voluminous.Cylinder;
import org.junit.jupiter.api.*;
import point.Point;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class CylinderTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setCircle() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        Cylinder cylinder = getCylinder();

        cylinder.square();

        assertEquals("The figure area 18,85", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPerimeter() {
        Cylinder cylinder = getCylinder();

        cylinder.perimeter();

        assertEquals("The figure has no perimeter", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCoordinates() {
        Cylinder cylinder = getCylinder();

        cylinder.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }

    public Cylinder getCylinder() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 0 2");
        Point pointC = new Point("1 0 0");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Cylinder(points);
    }
}