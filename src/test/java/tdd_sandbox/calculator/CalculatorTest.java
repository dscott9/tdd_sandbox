package tdd_sandbox.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by dale_ on 17/04/2017.
 */
public class CalculatorTest {

    private Calculator calculator;

    @Before
    public void setUp() {
        calculator = new Calculator(0);
    }

    @Test
    public void shouldAddNumbersTogether() {
        calculator.add(1);
        assertEquals(1, calculator.getTotal());
    }

    @Test
    public void shouldSubtractNumber() {
        calculator.subtract(1);
        assertEquals(-1, calculator.getTotal());
    }

    @Test
    public void shouldMultiplyTotalByNumber() {
        calculator = new Calculator(1);
        calculator.multiplyBy(2);
        assertEquals(2, calculator.getTotal());
    }

    @Test
    public void shouldDivideTotalByNumber() {
        calculator = new Calculator(2);
        calculator.divideBy(2);
        assertEquals(1, calculator.getTotal());
    }

    @Test
    public void shouldProduceCorrectTotal() {
        calculator = new Calculator(10);
        calculator.add(2);
        calculator.subtract(6);
        calculator.multiplyBy(2);
        calculator.divideBy(2);
        assertEquals(6, calculator.getTotal());
    }
}
