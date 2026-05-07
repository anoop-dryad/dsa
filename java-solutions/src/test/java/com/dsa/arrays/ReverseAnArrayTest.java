package com.dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.ReverseAnArray;

public class ReverseAnArrayTest {
    @ParameterizedTest()
    @MethodSource("ProvideAllArrays")
    public void testArrayReversal(int[] inputArray, int[] reversedArray) {
        assertArrayEquals(ReverseAnArray.reversedArray(inputArray), reversedArray);
    }

    private static Stream<Arguments> ProvideAllArrays() {
        return Stream.of(Arguments.of(IntStream.of(1, 2, 3).toArray(), IntStream.of(3, 2, 1).toArray()));
    }
}
