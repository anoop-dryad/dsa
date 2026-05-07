package com.dsa.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrowsExactly;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.SecondLargestElementIndexInAnArray;

public class SecondLargetElementTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testSecondLargestElement(int[] inputArray, int result){
        assertEquals(SecondLargestElementIndexInAnArray.getSecondLargestElement(inputArray), result);
    }

    @Test
    public void testInvalidArray(){
        int[] inputArray = new int[0];
        IllegalArgumentException exception = assertThrowsExactly(IllegalArgumentException.class,() -> {
            SecondLargestElementIndexInAnArray.getSecondLargestElement(inputArray);
        });
        assertEquals(exception.getMessage(), "Invalid Array");
    }

    @Test
    public void testArrayWithEqualValues(){
        int[] inputArray = new int[]{2,2,2,2,2};
        IllegalArgumentException exception = assertThrowsExactly(IllegalArgumentException.class,() -> {
            SecondLargestElementIndexInAnArray.getSecondLargestElement(inputArray);
        });
        assertEquals(exception.getMessage(), "No second largest element");
    }


    private static Stream<Arguments> provideAllArrays(){
        return Stream.of(
            Arguments.of(IntStream.of(1,2,3,4,5,6,7,8,9).toArray(), 8),
            Arguments.of(IntStream.of(19,2,23,44,25,56,78,38,39).toArray(), 56),
            Arguments.of(IntStream.of(11,32,43,24,65,16,77,38,99).toArray(), 77),
            Arguments.of(IntStream.of(100, 3, 3, 3).toArray(), 3)
        );
    }
}
