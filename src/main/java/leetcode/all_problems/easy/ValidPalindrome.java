package leetcode.all_problems.easy;

import java.util.Arrays;
import java.util.stream.Collectors;

public class ValidPalindrome {
    public boolean isPalindrome(String s) {
        String cleanedStr = String.join("", s.split("\\W+|_")).toLowerCase();
        return new StringBuilder(cleanedStr).reverse().toString().equals(cleanedStr);
    }
}
