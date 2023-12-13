package figures.polygon;

import figures.Polygon;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class Polygon_Square_Test extends PolygonObject{

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setCircle() {

        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    @DisplayName("when polygon in 2d")
    public void testTwoDSquare() {
        Polygon polygon = getTwoDPolygon();

        polygon.square();

        assertEquals("The figure area 1,00", outputStreamCaptor.toString().trim());
    }

    @Test
    @DisplayName("when polygon in 3d")
    public void testThreeDSquare() {
        Polygon polygon = getThreeDPolygon();

        polygon.square();

        assertEquals("The figure area 1,12", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
