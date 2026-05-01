package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import java.math.BigInteger;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.dsa.datastructures.Factorial;

public class FactorialTest {

    @ParameterizedTest()
    @CsvSource({
            "1,1",
            "2,2",
            "3,6",
            "4,24",
            "6,720",
            "0,1",
            "20,2432902008176640000",
    })
    public void testFactorialOfNumbers(int inputNumber, BigInteger expectedResult) {
        assertEquals(Factorial.getFactorial(inputNumber), expectedResult);
    }

    @Test
    public void testFactorialOfNegativeNumbers() {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class,
                () -> Factorial.getFactorial(-2));

        assertEquals(exception.getMessage(), "min=0 and max=1000");
    }
}
