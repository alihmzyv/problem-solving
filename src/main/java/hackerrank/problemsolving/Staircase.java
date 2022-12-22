package hackerrank.problemsolving;

import java.util.stream.IntStream;

public class Staircase {
    private final static String space = " ";
    public static void staircase(int n) {
        System.out.println(getStaircaseOf(n, "#"));
    }

    private static String getStaircaseOf(int size, String symbol) {
        StringBuilder sb = new StringBuilder();
        IntStream.rangeClosed(1, size)
                .forEach(row -> {
                    sb.append(space.repeat(size - row));
                    sb.append(symbol.repeat(row));
                    sb.append("\n");
                });
        return sb.toString();
    }
}
