package Test;

import classes.Calculator;

import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class TestCalculator{

    private Calculator calculator;

    public void scenario() {

        calculator = new Calculator();
    }

    @Test
    public void add() {
        scenario();
        assertEquals(8,calculator.add(4,4));
        assertEquals(5,calculator.add(2,3));
    }

    @Test
    public void subtract() {
        scenario();
        assertEquals(2,calculator.subtract(4,2));
        assertEquals(8,calculator.subtract(10,2));
    }

    @Test
    public void multiply() {
        scenario();
        assertEquals(16,calculator.multiply(4,4));
        assertEquals(25,calculator.multiply(5,5));
    }

    @Test
    public void divide() {
        scenario();
        assertEquals(1,calculator.divide(4,4));
        assertEquals(5,calculator.divide(10,2));
    }

}
