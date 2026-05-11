package com.dsa.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.MaxCircularSumSubArray;

public class MaxCircularSumSubArrayTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testMaxCircularSumSubArray(int[] inputArray, int result){
        assertEquals(MaxCircularSumSubArray.getMaxCircularSumSubArray(inputArray), result);
    }
    private static Stream<Arguments> provideAllArrays(){
        return Stream.of(
            Arguments.of(IntStream.of(-1, 10, 20, -5).toArray(),30),
            Arguments.of(IntStream.of(10, -20, 10).toArray(),20),
            Arguments.of(IntStream.of(5, -3, 5).toArray(),10),
            Arguments.of(IntStream.of(1, 10, 1).toArray(),12),
            Arguments.of(IntStream.of(-2, -3, -1).toArray(),-1));

    }
}
