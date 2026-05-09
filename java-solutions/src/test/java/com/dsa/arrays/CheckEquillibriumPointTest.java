package com.dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.EquillibriumPoint;

public class CheckEquillibriumPointTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testEquillibriumPoint(int[] inputArray, boolean result) {
        assertEquals(EquillibriumPoint.checkEquillibriumPoint(inputArray), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(IntStream.of(3, 4, 8, -9, 9, 7).toArray(), true),
                Arguments.of(IntStream.of(-7, 1, 5, 2, -4, 3, 0).toArray(), true),
                Arguments.of(IntStream.of(1, 2, 3).toArray(), false),
                Arguments.of(IntStream.of(4, 2, 2).toArray(), false),
                Arguments.of(IntStream.of(3, 4, 8, -9, 20, 6).toArray(), true));
    }
}
