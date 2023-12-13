package figures.parallelogram;

import figures.Parallelogram;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parallelogram_Square_Test extends ParallelogramObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when parallelogram in 2d")
    public void testSquareTwoD() {
        Parallelogram parallelogram = getParalellogramTwoD();

        parallelogram.square();

        assertEquals("The figure area 1,00", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when circle in 3d")
    public void testSquareThreeD() {
        Parallelogram parallelogram = getParalellogramThreeD();

        parallelogram.square();

        assertEquals("The figure area 1,73", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
