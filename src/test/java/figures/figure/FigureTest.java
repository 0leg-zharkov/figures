package figures.figure;

import figures.Figure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FigureTest {

    private final PrintStream standardOut = System.out;
    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @BeforeEach
    public void setCheck() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @Test
    public void testSquare() {
        Figure figure = new Figure();

        figure.square();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testPerimeter() {
        Figure figure = new Figure();

        figure.perimeter();

        assertEquals("The figure perimeter 4,00", outputStreamCaptor.toString().trim());
    }

    @Test
    public void testCoordinate() {
        Figure figure = new Figure();

        figure.coordinates();

        assertEquals("The figure is valid", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
