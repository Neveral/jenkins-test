import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

/**
 * Created by Neveral on 14/09/2017.
 */
public class CalculatorTest {
    Calculator calculator;

    @Before
    public void init() {
        calculator = new Calculator();
    }

    @Test
    public void calculateSumTest() {
        long sum = calculator.calculateSum(4, 2);
        assertEquals(5, sum);
    }

}