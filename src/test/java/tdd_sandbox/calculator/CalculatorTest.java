package tdd_sandbox.calculator;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created: dale_
 * Date: 17/04/2017.
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
    public void shouldAddNegativeNumber() {
        calculator.add(-2);
        assertEquals(-2, calculator.getTotal());
    }

    @Test
    public void shouldSubtractNumber() {
        calculator.subtract(1);
        assertEquals(-1, calculator.getTotal());
    }

    @Test
    public void shouldSubtractNegativeNumber() {
        calculator.subtract(-3);
        assertEquals(3, calculator.getTotal());
    }

    @Test
    public void shouldMultiplyTotalByNumber() {
        calculator = new Calculator(1);
        calculator.multiplyBy(2);
        assertEquals(2, calculator.getTotal());
    }

    @Test
    public void shouldMultiplyByNegativeNumber() {
        calculator = new Calculator(5);
        calculator.multiplyBy(-5);
        assertEquals(-25, calculator.getTotal());
    }

    @Test
    public void shouldDivideTotalByNumber() {
        calculator = new Calculator(2);
        calculator.divideBy(2);
        assertEquals(1, calculator.getTotal());
    }

    @Test
    public void shouldDivideTotalByNegativeNumber() {
        calculator = new Calculator(10);
        calculator.divideBy(-5);
        assertEquals(-2, calculator.getTotal());
    }

    @Test
    public void shouldProduceCorrectTotal() {
        calculator = new Calculator(10);
        calculator.add(2);
        assertEquals(12, calculator.getTotal());
        calculator.subtract(6);
        assertEquals(6, calculator.getTotal());
        calculator.multiplyBy(2);
        assertEquals(12, calculator.getTotal());
        calculator.divideBy(2);
        assertEquals(6, calculator.getTotal());
    }

    @Test
    public void shouldProduceNegativeTotal() {
        calculator.subtract(4);
        calculator.multiplyBy(2);
        calculator.divideBy(1);
        assertEquals(-8, calculator.getTotal());
    }
}
