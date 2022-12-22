package hackerrank.problemsolving;

import java.util.List;
import java.util.function.IntPredicate;

public class PlusMinus {
    public static void plusMinus(List<Integer> arr) {
        System.out.printf("%.6f\n%.6f\n%.6f\n",
                findRatio(arr, i -> i > 0),
                findRatio(arr, i -> i < 0),
                findRatio(arr, i -> i == 0));
    }

    private static double findRatio(List<Integer> arr, IntPredicate predicate) {
        return (double) arr.stream()
                .mapToInt(i -> i)
                .filter(predicate)
                .count() / arr.size();
    }
}
