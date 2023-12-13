package figures.voluminous.truncated;

import figures.voluminous.TruncatedSphere;
import org.junit.jupiter.api.*;
import point.Point;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;

import static org.assertj.core.api.BDDAssertions.then;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class TruncatedSphereTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setCircle() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        TruncatedSphere truncatedSphere = getTruncatedSphere();

        truncatedSphere.square();

        assertEquals("The figure area 18,85", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPerimeter() {
        TruncatedSphere truncatedSphere = getTruncatedSphere();

        truncatedSphere.perimeter();

        assertEquals("The figure has no perimeter", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCoordinates() {
        TruncatedSphere truncatedSphere = getTruncatedSphere();

        truncatedSphere.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }

    public TruncatedSphere getTruncatedSphere() {
        Point pointA = new Point("0 0 0");
        Point pointB = new Point("0 0 3");
        Point pointC = new Point("0 0 2");
        List<Point> points = new ArrayList<>();
        points.add(pointA);
        points.add(pointB);
        points.add(pointC);
        return new TruncatedSphere(points);
    }
}