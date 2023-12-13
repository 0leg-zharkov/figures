package figures.triangle;

import figures.Triangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Triangle_Square_Test extends TriangleObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when square in 2d")
    public void testTwoDSquare() {
        Triangle triangle = getTwoDTriangle();

        triangle.square();

        assertEquals("The figure area 0,50", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when square in 3d")
    public void testThreeDSquare() {
        Triangle triangle = getThreeDTriangle();

        triangle.square();

        assertEquals("The figure area 0,71", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
