package com.dsa.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.MaxAppearingElement;

public class MaxAppearingElementsTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testMaxAppearingElements(int[] leftArray, int[] rightArray, int result){
        assertEquals(MaxAppearingElement.getMaxAppearingElement(leftArray, rightArray), result);
    }
    private static Stream<Arguments> provideAllArrays(){
        return Stream.of(
            Arguments.of(IntStream.of(1,3).toArray(),IntStream.of(2,4).toArray(), 1),
            Arguments.of(IntStream.of(1, 4, 3, 1).toArray(),IntStream.of(15, 8, 5, 4).toArray(), 4),
            Arguments.of(IntStream.of(1, 5, 9, 13, 21).toArray(),IntStream.of(15, 8, 12, 20, 24).toArray(), 5));
    }
}
