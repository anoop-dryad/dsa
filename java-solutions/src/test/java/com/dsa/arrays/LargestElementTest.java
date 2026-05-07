package com.dsa.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.LargestElement;

public class LargestElementTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testLargestElementInAnArray(int[] inputArray, int result){
        assertEquals(LargestElement.getLargestElelmentInAnArray(inputArray), result);
    }

    private static Stream<Arguments> provideAllArrays(){
        return Stream.of(
            Arguments.of(IntStream.of(1,2,3,4,5,6,7,8,9).toArray(), 9),
            Arguments.of(IntStream.of(19,2,23,44,25,56,78,38,39).toArray(), 78),
            Arguments.of(IntStream.of(11,32,43,24,65,16,77,38,99).toArray(), 99)
        );
    }
}
