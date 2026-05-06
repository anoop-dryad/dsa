package com.dsa;

import java.util.List;
import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;

import com.dsa.datastructures.PrimeFactors;

public class PrimeFactorsTest {
    
    @ParameterizedTest()
    @MethodSource("providePrimeFactors")
    public void testPrimeFactors(int input, List<Integer> result){
        assertEquals(PrimeFactors.getPrimeFactors(input), result);
    }

    private static Stream<Arguments> providePrimeFactors() {
    return Stream.of(
        Arguments.of(450, List.of(2, 3, 3, 5, 5)),
        Arguments.of(12, List.of(2, 2, 3)),
        Arguments.of(13, List.of(13)),
        Arguments.of(315, List.of(3,3,5,7))
    );
}
}
