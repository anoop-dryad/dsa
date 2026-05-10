package com.dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.SubArrayWithGivenSum;

public class SubArrayWithGivenSumTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testSubArrayWithGivenSumTest(int[] inputArray, int sum, boolean result) {
        assertEquals(SubArrayWithGivenSum.checkSubArrayWithGivenSumIsPresent(inputArray, sum), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(IntStream.of(1, 4, 20, 3, 10, 5).toArray(), 33, true),
                Arguments.of(IntStream.of(10, 2, 3).toArray(), 12, true),
                Arguments.of(IntStream.of(1, 2, 3, 15).toArray(), 18, true),
                Arguments.of(IntStream.of(5).toArray(), 5, true),
                Arguments.of(IntStream.of(1, 2, 3).toArray(), 10, false),
                Arguments.of(IntStream.of(0, 0, 0).toArray(), 0, true));
    }
}
