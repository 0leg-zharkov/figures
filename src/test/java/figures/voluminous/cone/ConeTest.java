package figures.voluminous.cone;

import figures.voluminous.Cone;
import org.junit.jupiter.api.*;
import point.Point;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class ConeTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setCircle() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        Cone cone = getCircle();

        cone.square();

        assertEquals("The figure area 7,58", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPerimeter() {
        Cone cone = getCircle();

        cone.perimeter();

        assertEquals("The figure has no perimeter", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCoordinates() {
        Cone cone = getCircle();

        cone.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }

    public Cone getCircle() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 1 0");
        Point pointC = new Point("0 0 1");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new Cone(points);
    }
}

