package figures.parallelogram;

import figures.Parallelogram;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parallelogram_Perimeter_Test extends ParallelogramObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when parallelogram in 2d")
    public void testPerimeterTwoD() {
        Parallelogram parallelogram = getParalellogramTwoD();

        parallelogram.perimeter();

        assertEquals("The figure perimeter 4,83", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when parallelogram in 3d")
    public void testPerimeterThreeD() {
        Parallelogram parallelogram = getParalellogramThreeD();

        parallelogram.perimeter();

        assertEquals("The figure perimeter 5,66", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
