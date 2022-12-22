package leetcode.all_problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ValidParanthesesTest {

    @Test
    void isValidTest1() {
        ValidParantheses validParantheses = new ValidParantheses();
        String parantheses = "()";
        assertTrue(validParantheses.isValid(parantheses));
    }

    @Test
    void isValidTest2() {
        ValidParantheses validParantheses = new ValidParantheses();
        String parantheses = "()[]{}";
        assertTrue(validParantheses.isValid(parantheses));
    }

    @Test
    void isValidTest3() {
        ValidParantheses validParantheses = new ValidParantheses();
        String parantheses = "(]";
        assertFalse(validParantheses.isValid(parantheses));
    }
}