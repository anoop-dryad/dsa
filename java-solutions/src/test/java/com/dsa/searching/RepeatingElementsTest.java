package com.dsa.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.searching.RepeatingElements;

public class RepeatingElementsTest {
    @ParameterizedTest
    @MethodSource("provideAllArrays")
    public void testRepeatingElements(int[] inputArray, int result) {
        assertEquals(RepeatingElements.findRepeatingElementsWithZero(inputArray), result);
    }

    @ParameterizedTest
    @MethodSource("provideAllArraysWithoutZero")
    public void testRepeatingElementsWitout(int[] inputArray, int result) {
        assertEquals(RepeatingElements.findRepeatingElementsWithoutZero(inputArray), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(new int[] { 0, 1, 3, 2, 2 }, 2),
                Arguments.of(new int[] { 0, 2, 1, 3, 5, 4, 6, 2 }, 2));
    }

    private static Stream<Arguments> provideAllArraysWithoutZero() {
        return Stream.of(
                Arguments.of(new int[] { 3, 1, 3, 4, 2 }, 3),
                Arguments.of(new int[] { 1, 3, 2, 4, 3, 3 }, 3),
                Arguments.of(new int[] { 1, 1 }, 1));
    }
}
