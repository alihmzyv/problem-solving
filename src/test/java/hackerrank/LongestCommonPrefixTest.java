package hackerrank;

import leetcode.all_problems.easy.LongestCommonPrefix;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class LongestCommonPrefixTest {

    @Test
    void longestCommonPrefixTest1() {
        String[] strs = new String[]{"flower", "flow", "flight"};
        String expectedResult = "fl";
        LongestCommonPrefix instance = new LongestCommonPrefix();
        assertEquals(expectedResult, instance.longestCommonPrefix(strs));
    }

    @Test
    void longestCommonPrefixTest2() {
        String[] strs = new String[]{"dog", "racecar", "car"};
        String expectedResult = "";
        LongestCommonPrefix instance = new LongestCommonPrefix();
        assertEquals(expectedResult, instance.longestCommonPrefix(strs));
    }
}