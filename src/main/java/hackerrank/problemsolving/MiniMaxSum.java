package hackerrank.problemsolving;

import java.util.List;

public class MiniMaxSum {
    public static void miniMaxSum(List<Integer> arr) {
        System.out.printf("%d %d\n", sumMin(arr, 4), sumMax(arr, 4));
    }

    public static long sumMin(List<Integer> arr, int size) {
        return arr.stream()
                .mapToLong(i -> i)
                .sorted()
                .limit(size)
                .sum();
    }

    public static long sumMax(List<Integer> arr, int size) {
        return arr.stream()
                .mapToLong(i -> i)
                .sorted()
                .skip(arr.size() - size)
                .sum();
    }
}
