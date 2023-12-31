package figures.voluminous.truncated;

import figures.voluminous.TruncatedSphere;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Truncated_SphereSquare_Test extends TruncatedSphereObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        TruncatedSphere truncatedSphere = getTruncatedSphere();

        truncatedSphere.square();

        assertEquals("The figure area 18,85", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
