import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class CalculatorTest {

    Calculator calculator;

    @Before
    public void before() {calculator = new Calculator();}


    @Test
    public void canAdd() {
        assertEquals(15, calculator.add(7, 8));
    }

    @Test
    public void canSubtract(){
        assertEquals(12, calculator.subtract(17, 5));
    }

    @Test
    public void canMultiply(){
        assertEquals( 49, calculator.multiply(7,7));
    }

    @Test
    public void canDivide(){
        assertEquals(4, calculator.divide(40, 10));
    }

}

