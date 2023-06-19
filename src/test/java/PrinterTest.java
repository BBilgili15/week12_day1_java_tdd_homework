import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {
        printer = new Printer(100, 1000);
    }

    @Test
    public void hasPrinted() {
        printer.print(2, 3);
        assertEquals(94, printer.getNumOfSheets());
        assertEquals(994, printer.getToner());
    }

}
