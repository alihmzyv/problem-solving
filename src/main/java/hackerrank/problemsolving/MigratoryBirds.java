package hackerrank.problemsolving;

import java.util.*;
import java.util.function.Function;
import java.util.stream.Collectors;

import static java.util.Comparator.*;

public class MigratoryBirds {
    private final static Comparator<Map.Entry<Integer, Long>> countComparator = Map.Entry.comparingByValue();
    private final static Comparator<Map.Entry<Integer, Long>> idComparator = Map.Entry.comparingByKey();

    public static int migratoryBirds(List<Integer> arr) {
        HashMap<Integer, Long> idCountMap = new HashMap<>();
        arr.forEach(id -> idCountMap.compute(id, (key, value) -> (value == null) ? 1 : ++value));
        return  arr.stream()
                .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
                .entrySet()
                .stream()
                .max(countComparator.thenComparing(idComparator.reversed()))
                .map(Map.Entry::getKey)
                .orElse(0);
    }
}
