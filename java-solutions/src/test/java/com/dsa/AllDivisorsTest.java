package com.dsa;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.List;
import java.util.stream.Stream;

import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.AllDivisors;

public class AllDivisorsTest {

    @ParameterizedTest
    @MethodSource("provideAllDivisors")
    public void testAllGetDivisors(int input, List<Integer> result) {
        assertEquals(AllDivisors.getAllDivisors(input), result);
    }

    private static Stream<Arguments> provideAllDivisors() {
        return Stream.of(
                Arguments.of(15, List.of(1, 3, 5, 15)),
                Arguments.of(100, List.of(1, 2, 4, 5, 10, 20, 25, 50, 100)),
                Arguments.of(7, List.of(1, 7)));
    }

}
