package com.dsa.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.searching.PairWithGivenSum;

public class PairWithGivenSumTest {
    @ParameterizedTest
    @MethodSource("provideAllArrays")
    public void testPairWithGivenSum(int[] inputArray, int sum, boolean result) {
        assertEquals(PairWithGivenSum.checkIfPairAvailableInGivenArray(inputArray, sum), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(new int[] { 2, 5, 8, 12, 30 }, 17, true),
                Arguments.of(new int[] { 3, 8, 13, 18 }, 14, false),
                Arguments.of(new int[] { 2, 4, 8, 9, 11, 12, 20, 30 }, 23, true));
    }
}
