package hackerrank.all.easy;

import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.stream.IntStream;

public class CompareTheTriplets {
    public static List<Integer> compareTriplets(List<Integer> a, List<Integer> b) {
        AtomicInteger pointA = new AtomicInteger();
        AtomicInteger pointB = new AtomicInteger();
        IntStream.rangeClosed(0, a.size() - 1)
                .forEach(index -> {
                    int ratingA = a.get(index);
                    int ratingB = b.get(index);
                    if (ratingA > ratingB) {
                        pointA.getAndIncrement();
                    }
                    else if (ratingA < ratingB) {
                        pointB.getAndIncrement();
                    }
                });
        return List.of(pointA.get(), pointB.get());
    }
}
