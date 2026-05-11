package com.dsa.arrays;

import java.util.stream.IntStream;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.arrays.StockBuyAndSell;

public class StockBuyAndSellTest {
    @ParameterizedTest()
    @MethodSource("provideAllArrays")
    public void testMaxProfitBySellingStock(int[] inputArray, int result){
        assertEquals(result, StockBuyAndSell.getMaxProfit(inputArray));
    }

    private static Stream<Arguments> provideAllArrays(){
        return Stream.of(
            Arguments.of(IntStream.of(100, 180, 260, 310, 40, 535, 695).toArray(), 865),
            Arguments.of(IntStream.of(4, 2, 2, 2, 4).toArray(), 2),
            Arguments.of(IntStream.of(10, 8, 5, 2, 1).toArray(), 0),
            Arguments.of(IntStream.of(5, 5, 5, 5, 5).toArray(), 0),
            Arguments.of(IntStream.of(10, 20, 30).toArray(), 20),
            Arguments.of(IntStream.of(1, 100).toArray(), 99)
        );    
    }
}
