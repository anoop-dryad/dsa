package com.dsa.arrays;

import java.util.Map;
import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.FrequenciesInArray;

public class FrequenciesInArrayTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testFrequenciesInArray(int[] inputArray, Map<Integer, Integer> resultMap){
        assertEquals(resultMap, FrequenciesInArray.getFrequenciesInArray(inputArray));
    }

    private static Stream<Arguments> provideAllArrays(){
        return Stream.of(
            Arguments.of(IntStream.of().toArray(),Map.of()),
            Arguments.of(IntStream.of(10).toArray(),Map.of(10,1)),
            Arguments.of(IntStream.of(5,5,5,5).toArray(),Map.of(5,4)),
            Arguments.of(IntStream.of(1, 1, 2, 3, 3, 3).toArray(),Map.of(1,2,2,1,3,3)),
            Arguments.of(IntStream.of(-1, -1, 0, 0, 0).toArray(),Map.of(-1, 2, 0, 3)),
            Arguments.of(IntStream.of(-100, 200, 200, 5000).toArray(),Map.of(-100, 1, 200, 2, 5000, 1)),
            Arguments.of(IntStream.of(10, 5, 10, 5, 5).toArray(),Map.of(10, 2, 5, 3)));
    }
}
