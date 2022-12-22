package leetcode.all_problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RomanToIntegerTest {

    @Test
    void romanToIntTest1() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String roman = "III";
        int expected = 3;
        assertEquals(expected, romanToInteger.romanToInt(roman));
    }

    @Test
    void romanToIntTest2() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String roman = "LVIII";
        int expected = 58;
        assertEquals(expected, romanToInteger.romanToInt(roman));
    }

    @Test
    void romanToIntTest3() {
        RomanToInteger romanToInteger = new RomanToInteger();
        String roman = "MCMXCIV";
        int expected = 1994;
        assertEquals(expected, romanToInteger.romanToInt(roman));
    }

}