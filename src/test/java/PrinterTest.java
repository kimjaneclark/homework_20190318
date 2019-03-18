import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class PrinterTest {

    Printer printer;

    @Before
    public void before() {printer = new Printer(100, 500);}

    @Test
    public void hasPaper(){
        assertEquals(100, printer.getNoOfPages());
    }

    @Test
    public void Printed(){
        assertEquals(80, printer.print(10, 2));
    }

    @Test
    public void Refilled(){
        assertEquals(150, printer.refill(50));
    }

    @Test
    public void hasToner(){
        assertEquals(500, printer.getTonerVolume());
    }

}
