package figures.rectangle;

import figures.Rectangle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Rectangle_Perimeter_Test extends RectangleObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when polygon in 2d")
    public void testTwoDPerimeter() {
        Rectangle rectangle = getTwoDRectangle();

        rectangle.perimeter();

        assertEquals("The figure perimeter 6,00", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when polygon in 3d")
    public void testThreeDPerimeter() {
        Rectangle rectangle = getThreeDRectangle();

        rectangle.perimeter();

        assertEquals("The figure perimeter 6,47", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
