package leetcode.all_problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidPalindromeTest {

    @Test
    void isPalindrome() {
        ValidPalindrome validPalindrome = new ValidPalindrome();
        String test1 = "ab_a";
        assertTrue(validPalindrome.isPalindrome(test1));
    }
}