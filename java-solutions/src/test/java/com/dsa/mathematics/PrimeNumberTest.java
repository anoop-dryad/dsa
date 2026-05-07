package com.dsa.mathematics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.dsa.datastructures.mathematics.PrimeNumbers;

public class PrimeNumberTest{
    @ParameterizedTest()
    @CsvSource({"13,true","14,false","101,true",})
    public void testNumberIsPalindrome(int input, boolean  result){
        assertEquals(PrimeNumbers.isNumberPrime(input), result);
    }
}
