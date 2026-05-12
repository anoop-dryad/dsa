package com.dsa.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.searching.SearchInInfiniteSizedArray;

public class SearchInInfiniteSizedArrayTest {
    @ParameterizedTest
    @MethodSource("provideAllArrays")
    public void testSerchInInfiniteSizedArray(int[] inputArray, int value, int result) {
        assertEquals(SearchInInfiniteSizedArray.checkIfValuePresentInInfiniteSizedArray(inputArray, value), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(IntStream.of(1, 10, 15, 20, 40, 60, 80, 100, 200, 500, 10000).toArray(), 100, 0),
                Arguments.of(IntStream.of(1, 10, 15, 20, 40, 60, 80, 100, 200, 500, 10000).toArray(), 44, -1));
    }
}