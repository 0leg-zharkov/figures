package figures.square;

import figures.Square;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Square_Area_Test extends SquareObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when polygon in 2d")
    public void testTwoDSquare() {
        Square square = getTwoDSquare();

        square.square();

        assertEquals("The figure area 1,00", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when polygon in 3d")
    public void testThreeDSquare() {
        Square square = getThreeDSquare();

        square.square();

        assertEquals("The figure area 1,00", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
