package com.dsa.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.MaxConsecutiveOnes;

public class MaxConsecutiveOnesTest {
    @ParameterizedTest
    @MethodSource("provideAllArrays")
    public void testMaxConsecutiveOnes(int[] inputArray, int result){
        assertEquals(result, MaxConsecutiveOnes.getMaxConsecutiveOnesAvailable(inputArray));
    }

    private static Stream<Arguments> provideAllArrays(){
        return Stream.of(
            Arguments.of(IntStream.of().toArray(),0),
            Arguments.of(IntStream.of(0).toArray(),0),
            Arguments.of(IntStream.of(1).toArray(),1),
            Arguments.of(IntStream.of(1,1,1,1,1,1,1,1,1).toArray(),9),
            Arguments.of(IntStream.of(1,1,1,0,0,1,0,1).toArray(),3),
            Arguments.of(IntStream.of(0,1,1,1,0,0,1,1,1,1,1).toArray(),5),
            Arguments.of(IntStream.of(1, 1, 2, 0, 1).toArray(),2),
            Arguments.of(IntStream.of(1, 1, 2, 0, 1, -1, 1).toArray(),2));
    }
}
