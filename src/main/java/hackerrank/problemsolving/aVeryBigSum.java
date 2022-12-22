package hackerrank.problemsolving;

import java.util.List;

public class aVeryBigSum {
    public static long aVeryBigSum(List<Long> ar) {
        return ar.stream()
                .mapToLong(i -> i)
                .sum();
    }
}
