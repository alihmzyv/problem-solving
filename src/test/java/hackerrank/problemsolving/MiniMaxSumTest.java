package hackerrank.problemsolving;

import hackerrank.all.easy.MiniMaxSum;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

class MiniMaxSumTest {

    @Test
    void miniMaxSumTest1() {
        List<Integer> list = List.of(256741038, 623958417, 467905213, 714532089, 938071625);
        long minSum = 2063136757;
        long maxSum = 2744467344L;
        assertEquals(minSum, MiniMaxSum.sumMin(list, 4));
        assertEquals(maxSum, MiniMaxSum.sumMax(list, 4));
    }
}