package leetcode.all_problems.easy;


import java.util.Map;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class RomanToInteger {
    private final static Map<Character, Integer> map = Map.of(
            'I', 1,
            'V', 5,
            'X', 10,
            'L', 50,
            'C', 100,
            'D', 500,
            'M', 1000);
    public int romanToInt(String s) {
        int length = s.length();
        AtomicInteger result = new AtomicInteger();
        AtomicInteger countSame = new AtomicInteger();
        IntStream.rangeClosed(0, length - 1)
                .forEach(index -> {
                    int currDigit = getInt(s.charAt(index));
                    if (index == length - 1) {
                        result.getAndAdd((countSame.incrementAndGet()) * currDigit);
                    }
                    else {
                        int nextDigit = getInt(s.charAt(index + 1));
                        if (nextDigit > currDigit) {
                            result.getAndAdd(- (countSame.incrementAndGet()) * currDigit);
                            countSame.set(0);
                        }
                        else if (nextDigit < currDigit) {
                            result.getAndAdd((countSame.incrementAndGet()) * currDigit);
                            countSame.set(0);
                        }
                        else {
                            countSame.getAndIncrement();
                        }
                    }
                });
        return result.get();
    }

    private int getInt(char roman) {
        return map.get(roman);
    }
}
