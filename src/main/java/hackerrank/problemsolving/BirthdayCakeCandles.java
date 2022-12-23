package hackerrank.problemsolving;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class BirthdayCakeCandles {
    public static int birthdayCakeCandles(List<Integer> candles) {
        candles.sort(Collections.reverseOrder());
        return (int) candles.stream()
                .takeWhile(i -> i.equals(candles.get(0)))
                .count();
    }
}
