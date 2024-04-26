import org.example.SumCalculator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SumCalculatorTest {
    private SumCalculator calculator;

    @BeforeEach
    public void setUp() {
        calculator = new SumCalculator();
    }

    @Test
    public void testSumOfOne() {
        int expectedSum = 1;
        int actualSum = calculator.sum(1);
        assertEquals(expectedSum, actualSum);
    }

    @Test
    public void testSumOfThree() {
        int expectedSum = 6;
        int actualSum = calculator.sum(3);
        assertEquals(expectedSum, actualSum);
    }
    @Test
    public void testSumWithZeroThrowsException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
    }
}