package hackerrank.problemsolving;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BreakingTheRecordsTest {

    @Test
    void breakingRecordsTest1() {
        List<Integer> scores = List.of(10, 5, 20, 20, 4, 5, 2, 25, 1);
        List<Integer> expectedResult = List.of(2, 4);
        assertEquals(expectedResult, BreakingTheRecords.breakingRecords(scores));
    }

    @Test
    void breakingRecordsTest2() {
        List<Integer> scores = List.of(3, 4, 21, 36, 10, 28, 35, 5, 24, 42);
        List<Integer> expectedResult = List.of(4, 0);
        assertEquals(expectedResult, BreakingTheRecords.breakingRecords(scores));
    }
}