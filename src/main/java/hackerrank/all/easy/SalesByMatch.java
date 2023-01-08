package hackerrank.all.easy;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class SalesByMatch {
    public static int sockMerchant(int n, List<Integer> ar) {
        return (int) ar.stream()
                        .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                        .values()
                        .stream()
                        .mapToLong(i -> i / 2)
                        .sum();
    }
}
