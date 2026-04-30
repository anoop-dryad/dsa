package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.dsa.datastructures.PalindromeNumbers;

public class PalindromeNumbersTest {

    @ParameterizedTest()
    @CsvSource({
        "121, true",
        "123456, false",
        "6996, true",
        "0, true",
        "-121, false",
        "10, false"
    })
    void testNumberIsPalindrome(int inputNumber, boolean expectedResult){
        assertEquals(expectedResult, PalindromeNumbers.isNumberPalindrome(inputNumber));
    }

    @ParameterizedTest()
    @CsvSource({
        "121, true",
        "123456, false",
        "6996, true",
        "0, true",
        "-121, false",
        "10, false"
    })
    void testNumberIsPalindromeEfficiently(int inputNumber, boolean expectedResult){
        assertEquals(expectedResult, PalindromeNumbers.isNumberPalindromeEfficient(inputNumber));
    }
    
    
}
