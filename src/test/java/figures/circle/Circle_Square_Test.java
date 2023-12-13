package figures.circle;

import figures.Circle;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class Circle_Square_Test extends CircleObject {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when circle in 2d")
    public void testTwoDSquare() {
        Circle circle = getCircleTwoD();

        circle.square();

        assertEquals("The figure area 3,14", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when circle in 3d")
    public void testThreeDSquare() {
        Circle circle = getCircleThreeD();

        circle.square();

        assertEquals("The figure area 9,42", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}