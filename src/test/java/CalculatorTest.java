import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    public void canAdd() {
        assertEquals(10, calculator.add(5, 5));
    }

    @Test
    public void canSubtract() {
        assertEquals(5, calculator.subtract(10, 5));
    }


    @Test
    public void canMultiply() {
        assertEquals(14, calculator.multiply(2, 7));
    }

    @Test
    public void canDivide() {
        assertEquals(10, calculator.divide(20.0, 2.0), 0.0);
    }

}
