package hackerrank.problemsolving;

import java.util.List;

public class AppleAndOrange {
    public static void countApplesAndOranges(int s, int t, int a, int b,
                                             List<Integer> apples, List<Integer> oranges) {
        long countApples = apples.stream()
                .map(delta -> a + delta)
                .filter(point -> includes(s, t, point))
                .count();

        long countOranges = oranges.stream()
                .map(delta -> b + delta)
                .filter(point -> includes(s, t, point))
                .count();

        System.out.printf("%d\n%d\n", countApples, countOranges);
    }

    private static boolean includes(int start, int end, int point) {
        return point >= start && point <= end;
    }
}
