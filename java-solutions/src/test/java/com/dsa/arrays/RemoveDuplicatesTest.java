package com.dsa.arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.RemoveDuplicates;

public class RemoveDuplicatesTest {
    @ParameterizedTest()
    @MethodSource("ProvideAllArrays")
    public void testemoveDuplicates(int[] inputArray, int distinctElements) {
        assertEquals(distinctElements, RemoveDuplicates.removeDuplicatesFromArray(inputArray));
    }

    private static Stream<Arguments> ProvideAllArrays() {
        return Stream.of(Arguments
                .of(IntStream.of(1, 2, 2, 3, 4, 4, 4, 4, 4, 4, 5, 5, 5, 5, 6, 6, 6, 6, 6, 7, 8, 9).toArray(), 9));
    }
}
