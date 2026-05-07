package com.dsa.mathematics;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import com.dsa.datastructures.mathematics.GreatestCommonDivisor;;

public class GreatestCommonDivisorTest {

    @ParameterizedTest()
    @CsvSource({"12,15,3","10,15,5","4,6,2","100,200,100","7,13,1"})
    public void testGreatestCommonDivisor(int a, int b, int result){
        assertEquals(result, GreatestCommonDivisor.getGreatestCommonDivisor(a, b));
    }
    
}
