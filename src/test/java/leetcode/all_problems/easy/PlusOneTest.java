package leetcode.all_problems.easy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class PlusOneTest {

    @Test
    void plusOneTest1() {
        int[] arr = new int[]{1, 2, 3};
        int[] expectedResult = new int[]{1, 2, 4};
        PlusOne plusOne = new PlusOne();
        assertArrayEquals(expectedResult, plusOne.plusOne(arr));
    }

    @Test
    void plusOneTest2() {
        int[] arr = new int[]{4, 3, 2, 1};
        int[] expectedResult = new int[]{4, 3, 2, 2};
        PlusOne plusOne = new PlusOne();
        assertArrayEquals(expectedResult, plusOne.plusOne(arr));
    }

    @Test
    void plusOneTest3() {
        int[] arr = new int[]{9};
        int[] expectedResult = new int[]{1, 0};
        PlusOne plusOne = new PlusOne();
        assertArrayEquals(expectedResult, plusOne.plusOne(arr));
    }
}