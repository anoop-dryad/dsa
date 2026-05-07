package com.dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.CheckIfArraySorted;

public class CheckIfArraySortedTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testCheckIfArraySorted(int[] inputArray, boolean result) {
        assertEquals(CheckIfArraySorted.checkIfArrayIsSorted(inputArray), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(IntStream.of(8, 12, 15).toArray(), true),
                Arguments.of(IntStream.of(8, 10, 10, 12).toArray(), true),
                Arguments.of(IntStream.of(10, 10).toArray(), true),
                Arguments.of(IntStream.of(100, 20, 210).toArray(), false));
    }
}
