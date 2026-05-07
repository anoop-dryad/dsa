package com.dsa.mathematics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.dsa.datastructures.mathematics.TrailingZerosInFactorial;

public class TrailingZerosInFactorialTest {
    
    @ParameterizedTest
    @CsvSource({
        "5,1",
        "10,2",
        "100,24",
        "10,2",
        "251,62"
    })
    public void testGetTrailingZerosInFactorial(int number, int result){
        assertEquals(result, TrailingZerosInFactorial.getTrailingZerosInFactorial(number));
    }
}
