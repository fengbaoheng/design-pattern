package calculator;

import org.junit.Test;

import static org.junit.Assert.*;

public class CalculatorTest {

    private static final double DELTA = 0.000001;

    @Test
    public void testAdd() {
        double result = Calculator.calculate("+", 1, 1).doubleValue();
        assertEquals(2, result, DELTA);
    }

    @Test
    public void testSub() {
        double result = Calculator.calculate("-", 1, 2).doubleValue();
        assertEquals(-1, result, DELTA);
    }

    @Test
    public void testMultiply() {
        double result = Calculator.calculate("*", 3, 4).doubleValue();
        assertEquals(12, result, DELTA);
    }

    @Test
    public void testDivide() {
        double result = Calculator.calculate("/", 10, 2).doubleValue();
        assertEquals(5, result, DELTA);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testDivideZero() {
        Calculator.calculate("/", 10, 0).doubleValue();
    }

    @Test
    public void testSqrt() {
        double result = Calculator.calculate("sqrt", 9).doubleValue();
        assertEquals(3, result, DELTA);
    }
}