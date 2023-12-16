package figures.figure;

import figures.Figure;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class  FigureTestSquare {

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

        assertEquals("The figure has no area", outputStreamCaptor.toString().trim());
    }

    @AfterEach
    public void res() {
        System.setOut(standardOut);
    }
}
