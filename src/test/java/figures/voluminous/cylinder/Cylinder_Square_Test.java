package figures.voluminous.cylinder;

import figures.voluminous.Cylinder;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cylinder_Square_Test extends CylinderObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        Cylinder cylinder = getCylinder();

        cylinder.square();

        assertEquals("The figure area 18,85", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
