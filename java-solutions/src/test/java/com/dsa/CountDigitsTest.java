package com.dsa;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

import com.dsa.datastructures.CountDigits;

public class CountDigitsTest {

    @Test
    void testStandardNumber() {
        assertEquals(3, CountDigits.countDigits(new BigInteger("123")));
    }

    @Test
    void testZero() {
        assertEquals(1, CountDigits.countDigits(new BigInteger("0")));
    }
    
}
