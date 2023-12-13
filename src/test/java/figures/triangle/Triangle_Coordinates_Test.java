package figures.triangle;

import figures.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Triangle_Coordinates_Test extends TriangleObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when square in 2d")
    public void testCoordinates() {
        Triangle triangle = getTwoDTriangle();

        triangle.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when square in 3d")
    public void testThreeDCoordinates() {
        Triangle triangle = getThreeDTriangle();

        triangle.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
