package leetcode.all_problems.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.stream.IntStream;

public class WordPattern {
    private static final String DEFAULT_DELIMITER = " ";
    public boolean wordPattern(String pattern, String s) {
        return wordPattern(pattern, s, DEFAULT_DELIMITER);
    }

    private boolean wordPattern(String pattern, String s, String delimiter) {
        Map<Character, String> patternMap = new HashMap<>();
        String[] split = s.split(delimiter);
        int length = pattern.length();
        if (length != split.length) return false;
        return IntStream.rangeClosed(0, length - 1)
                .allMatch(index -> {
                    char letter = pattern.charAt(index);
                    String word = split[index];
                    if (patternMap.containsValue(word)) {
                        Optional<String> valueOpt = Optional.ofNullable(patternMap.get(letter));
                        return valueOpt.isPresent() && valueOpt.get().equals(word);
                    }
                    Optional<String> wordOpt = Optional.ofNullable(patternMap.putIfAbsent(letter, word));
                    if (wordOpt.isPresent()) return wordOpt.get().equals(word);
                    else {
                        patternMap.put(letter, word);
                        return true;
                    }
                });
    }
}
