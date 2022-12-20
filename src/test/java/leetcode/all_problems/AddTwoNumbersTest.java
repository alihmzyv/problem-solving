package leetcode.all_problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AddTwoNumbersTest {

    @Test
    void addTwoNumbersTest1() {
        assertEquals(new ListNode(89990001), new AddTwoNumbers().addTwoNumbers(new ListNode(9999999), new ListNode(9999)));
    }
}