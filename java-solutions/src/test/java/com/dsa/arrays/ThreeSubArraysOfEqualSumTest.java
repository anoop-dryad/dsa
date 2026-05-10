package com.dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.ThreeSubArraysOfEqualSum;

public class ThreeSubArraysOfEqualSumTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testThreeSubArraysOfEqualSum(int[] inputArray, boolean result) {
        assertEquals(ThreeSubArraysOfEqualSum.checkIf3SubArrysWithEqualSumPossible(inputArray), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(IntStream.of(0, 2, 1, -6, 6, -7, 9, 1, 2, 0, 1).toArray(), true),
                Arguments.of(IntStream.of(1, 2, 4).toArray(), false),
                Arguments.of(IntStream.of(0, 0, 0, 0).toArray(), true),
                Arguments.of(IntStream.of(-1, -1, -1, -1, -1, -1).toArray(), true),
                Arguments.of(IntStream.of(3, 3).toArray(), false));
    }
}
