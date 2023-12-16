package figures.voluminous.sphere;

import figures.voluminous.Sphere;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Sphere_Perimeter_Test extends SphereObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void set() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testPerimeter() {
        Sphere sphere = getSphere();

        sphere.perimeter();

        assertEquals("The figure has no perimeter", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
