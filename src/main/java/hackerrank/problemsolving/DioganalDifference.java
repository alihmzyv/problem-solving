package hackerrank.problemsolving;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class DioganalDifference {
    public static int diagonalDifference(List<List<Integer>> arr) {
        AtomicInteger sum1 = new AtomicInteger();
        AtomicInteger sum2 = new AtomicInteger();
        IntStream.rangeClosed(0, arr.size() - 1)
                .forEach(row -> {
                    sum1.addAndGet(arr.get(row).get(row));
                    sum2.addAndGet(arr.get(row).get(arr.size() - 1 - row));
                });
        return Math.abs(sum1.addAndGet( - sum2.get()));
    }
}
