package hackerrank.all.easy;

import java.util.List;

public class SimpleArraySum {
    public static int simpleArraySum(List<Integer> ar) {
        return ar.stream()
                .mapToInt(i -> i)
                .sum();
    }
}
