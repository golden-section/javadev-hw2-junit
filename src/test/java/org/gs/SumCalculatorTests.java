package org.gs;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class SumCalculatorTests {
    private SumCalculator calculator;

    @BeforeEach
    public void beforeEach() {
        calculator = new SumCalculator();
    }

    @Test
    public void testCorrectSumCalculation() {
        Assertions.assertEquals(1, calculator.sum(1));
        Assertions.assertEquals(6, calculator.sum(3));
    }

    @Test
    public void testException() {
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(0));
        Assertions.assertThrows(IllegalArgumentException.class, () -> calculator.sum(-3));
    }
}
