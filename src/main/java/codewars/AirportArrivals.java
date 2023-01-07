package codewars;

import java.util.Arrays;
import java.util.stream.Collector;
import java.util.stream.IntStream;

//https://www.codewars.com/kata/57feb00f08d102352400026e/train/java
public class AirportArrivals {
    private static final String ALPHABET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ ?!@#&()|<>.:=-+*/0123456789";
    private static final int alphabetSize = ALPHABET.length();

    public static String[] flapDisplay(final String[] lines, final int[][] rotors) {
        return IntStream.rangeClosed(0, lines.length - 1)
                .boxed()
                .map(index -> updateLine(lines[index], rotors[index]))
                .toArray(String[]::new);
    }

    private static String updateLine(String line, int[] rotors) {
        return IntStream.rangeClosed(0, line.length() - 1)
                .mapToObj(index ->
                        updateChar(line.charAt(index), sumArr(rotors, 0, index + 1)))
                .collect(Collector.of(
                        StringBuilder::new,
                        StringBuilder::append,
                        StringBuilder::append,
                        StringBuilder::toString));
    }

    private static char updateChar(char ch, int offset) {
        int currIndex = ALPHABET.indexOf(ch);
        int newIndex = currIndex + offset;
        if (newIndex >= alphabetSize) {
            newIndex = (offset - (alphabetSize - currIndex)) % alphabetSize;
        }
        return ALPHABET.charAt(newIndex);
    }

    private static int sumArr(int[] arr, int start, int end) {//end exclusive
        return Arrays.stream(arr)
                .skip(start)
                .limit(end - start)
                .sum();
    }
}
