package leetcode.all_problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class WordPatternTest {
    private final WordPattern wordPattern = new WordPattern();

    @Test
    void wordPatternTest1() {
        assertTrue(wordPattern.wordPattern("abba", "dog cat cat dog"));
    }

    @Test
    void wordPatternTest2() {
        assertFalse(wordPattern.wordPattern("abba", "dog cat cat fish"));
    }

    @Test
    void wordPatternTest3() {
        assertFalse(wordPattern.wordPattern("aaaa", "dog cat cat dog"));
    }

    @Test
    void wordPatternTest4() {
        assertFalse(wordPattern.wordPattern("abba", "dog dog dog dog"));
    }
}
