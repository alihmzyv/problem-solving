package leetcode.all_problems.easy;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SummaryRangesTest {

    @Test
    void summaryRangesTest1() {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] input = {0, 1, 2, 4, 5, 7};
        List<String> expectedResult = List.of("0->2", "4->5", "7");
        assertEquals(expectedResult, summaryRanges.summaryRanges(input));
    }

    @Test
    void summaryRangesTest2() {
        SummaryRanges summaryRanges = new SummaryRanges();
        int[] input = {0, 2, 3, 4, 6, 8, 9};
        List<String> expectedResult = List.of("0", "2->4", "6", "8->9");
        assertEquals(expectedResult, summaryRanges.summaryRanges(input));
    }
}