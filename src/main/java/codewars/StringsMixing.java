package codewars;

import java.util.Arrays;
import java.util.Map;
import java.util.Set;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

import static java.lang.Character.isLetter;
import static java.lang.Character.isLowerCase;

public class StringsMixing {
    static class Info implements Comparable<Info> {
        private Character ch;
        private String address;
        private Long count;

        public Info(Character ch, String address, Long count) {
            this.ch = ch;
            this.address = address;
            this.count = count;
        }

        public static Info of(Character ch, String address, Long count) {
            return new Info(ch, address, count);
        }

        public Character getCh() {
            return ch;
        }

        public String getAddress() {
            return address;
        }

        public Long getCount() {
            return count;
        }

        @Override
        public String toString() {
            return String.format("%s:%s", address, String.valueOf(ch).repeat(Math.toIntExact(count)));
        }

        @Override
        public int compareTo(Info o) {
            int flag = - Integer.compare(Math.toIntExact(this.count), Math.toIntExact(o.count));
            if (flag == 0) {
                flag = this.toString().compareTo(o.toString());
            }
            return flag;
        }
    }
    private static final Predicate<Character> isLowerCaseLetter = ch -> isLetter(ch) && isLowerCase(ch);

    public static String mix(String s1, String s2) {
        Map<Character, Long> mapS1 = count(s1, isLowerCaseLetter);
        Map<Character, Long> mapS2 = count(s2, isLowerCaseLetter);
        Set<Character> alphabet = getAlphabet(mapS1, mapS2);
        return alphabet.stream()
                .map(ch -> {
                    Long count1 = mapS1.getOrDefault(ch, 0L);
                    Long count2 = mapS2.getOrDefault(ch, 0L);
                    return getInfo(ch, count1, count2);
                })
                .filter(info -> info.getCount() > 1)
                .sorted()
                .map(Info::toString)
                .collect(Collectors.joining("/"));
    }

    private static Info getInfo(char ch, long count1, long count2) {
        if (count1 == count2) {
            return Info.of(ch, "=", count1);
        }
        else if (count1 > count2) {
            return Info.of(ch, "1", count1);
        }
        else {
            return Info.of(ch, "2", count2);
        }
    }

    private static Set<Character> getAlphabet(Map<Character, Long>... maps) {
        return Arrays.stream(maps)
                .flatMap(map -> map.keySet().stream())
                .collect(Collectors.toSet());
    }

    public static Map<Character, Long> count(String str, Predicate<Character> filter) {
        return Arrays.stream(unbox(str.toCharArray()))
                .filter(filter)
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
    }

    public static Character[] unbox(char[] chars) {
        Character[] unboxed = new Character[chars.length];
        for (int i = 0; i < chars.length; i++) {
            unboxed[i] = chars[i];
        }
        return unboxed;
    }
}
