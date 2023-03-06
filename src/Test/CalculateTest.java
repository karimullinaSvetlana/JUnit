package Test;

import com.company.Calculate;
import org.junit.Test;

import static org.junit.Assert.*;

public class CalculateTest {

    @Test
    public void sum() {
        Calculate calculate = new Calculate();
        assertEquals(10, calculate.sum(5,5));
    }

    @Test
    public void subtraction() {
        Calculate calculate = new Calculate();
        assertEquals(0, calculate.subtraction(5,5));
    }

    @Test
    public void division() {
        Calculate calculate = new Calculate();
        assertEquals(1, calculate.division(5,5));
    }

    @Test
    public void multiplication() {
        Calculate calculate = new Calculate();
        assertEquals(25, calculate.multiplication(5,5));
    }
}