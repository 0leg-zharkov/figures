package figures.parallelogram;

import figures.Parallelogram;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Parallelogram_Coordinates_Test extends ParallelogramObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when paralleloram in 2d")
    public void testCoordinatesTwoD() {
        Parallelogram parallelogram = getParalellogramTwoD();

        parallelogram.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when parallelogram in 3d")
    public void testCoordinatesThreeD() {
        Parallelogram parallelogram = getParalellogramThreeD();

        parallelogram.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
