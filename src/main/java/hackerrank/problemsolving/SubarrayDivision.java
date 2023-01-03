package hackerrank.problemsolving;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

public class SubarrayDivision {
    public static int birthday(List<Integer> s, int d, int m) {
        return (int) IntStream.rangeClosed(0, s.size() - m)
                .filter(index -> sumList(s, index, index + m) == d)
                .count();
    }

    public static long sumList(List<Integer> list, int start, int end) { //end exclusive
        return list.stream()
                .skip(start)
                .limit(end - start)
                .mapToInt(i -> i)
                .sum();
    }
}
