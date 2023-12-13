package figures.circle;

import figures.Circle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Circle_Coordinates_Test extends CircleObject {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when circle in 2d")
    public void testTwoDCoordinates() {
        Circle circle = getCircleTwoD();

        circle.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when circle in 3d")
    public void testThreeDCoordinates() {
        Circle circle = getCircleThreeD();

        circle.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
