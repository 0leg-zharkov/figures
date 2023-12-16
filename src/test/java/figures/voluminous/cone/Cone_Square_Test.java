package figures.voluminous.cone;

import figures.voluminous.Cone;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Cone_Square_Test extends ConeObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        Cone cone = getCone();

        cone.square();

        assertEquals("The figure area 7,58", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
