package com.dsa.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.searching.IndexOfFirstOccurrence;

public class IndexOfFirstOccurrenceTest {
    @ParameterizedTest
    @MethodSource("provideAllArrays")
    public void testIndexOfFirstOccurrence(int[] inputArray, int elementToSearch, int result) {
        assertEquals(result, IndexOfFirstOccurrence.getIndexOfFirstOccurrence(inputArray, elementToSearch));
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(IntStream.of(1, 10, 10, 10, 20, 20, 40).toArray(), 20, 4),
                Arguments.of(IntStream.of(10, 20, 30).toArray(), 15, -1),
                Arguments.of(IntStream.of(15, 15, 15).toArray(), 15, 0));
    }
}
