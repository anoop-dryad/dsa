package com.dsa.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.searching.SearchInSortedRotatedArray;

public class SearchInSortedRotatedArrayTest {
    @ParameterizedTest
    @MethodSource("provideAllArrays")
    public void testSearchInSortedRotatedArray(int[] inputArray, int number, int result) {
        assertEquals(SearchInSortedRotatedArray.findNumberInArray(inputArray, number), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(IntStream.of(4, 5, 6, 7, 0, 1, 2).toArray(), 2, 6),
                Arguments.of(IntStream.of(100, 200, 300, 400, 1, 10, 15, 20).toArray(), 10, 5));
    }
}
