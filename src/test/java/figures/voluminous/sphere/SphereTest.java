package figures.voluminous.sphere;

import figures.voluminous.Sphere;
import org.junit.jupiter.api.*;
import point.Point;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SphereTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setCircle() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        Sphere sphere = getSphere();

        sphere.square();

        assertEquals("The figure area 50,27", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPerimeter() {
        Sphere sphere = getSphere();

        sphere.perimeter();

        assertEquals("The figure has no perimeter", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCoordinates() {
        Sphere sphere = getSphere();

        sphere.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }

    public Sphere getSphere() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 0 2");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        return new Sphere(points);
    }
}