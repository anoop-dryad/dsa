package com.dsa.searching;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.searching.SquareRoot;

public class SquareRootTest {
    @ParameterizedTest
    @MethodSource("provideAllArrays")
    public void testSquareRoot(int value, int result) {
        assertEquals(SquareRoot.getSquareRoot(value), result);
    }

    private static Stream<Arguments> provideAllArrays() {
        return Stream.of(
                Arguments.of(4, 2),
                Arguments.of(90, 9),
                Arguments.of(14, 3),
                Arguments.of(122, 11),
                Arguments.of(627, 25));
    }
}
