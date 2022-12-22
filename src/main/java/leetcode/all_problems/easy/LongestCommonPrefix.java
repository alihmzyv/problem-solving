package leetcode.all_problems.easy;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Optional;

public class LongestCommonPrefix {
    private static final String defaultResult = "";
    public String longestCommonPrefix(String[] strs) {
        Optional<String> shortestStrOpt = getShortest(strs);
        if (shortestStrOpt.isEmpty()) {
            return "";
        }
        String shortestStr = shortestStrOpt.get();
        for (int i = shortestStr.length(); i >= 1; i--) {
            String prefix = shortestStr.substring(0, i);
            if (allStartsWith(strs, prefix)) {
                return prefix;
            }
        }
        return defaultResult;
    }
    private Optional<String> getShortest(String[] strs) {
        return Arrays.stream(strs)
                .min(Comparator.comparingInt(String::length));
    }
    private boolean allStartsWith(String[] strs, String prefix) {
        return Arrays.stream(strs)
                .allMatch(str -> str.startsWith(prefix));
    }
}
