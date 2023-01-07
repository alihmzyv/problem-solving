package hackerrank.all.easy;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

//https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem?isFullScreen=true
public class BreakingTheRecords {
    public static List<Integer> breakingRecords(List<Integer> scores) {
        Map<String, Integer> records = new HashMap<>();
        Map<String, Integer> breaks = new HashMap<>();
        breaks.put("min", 0);
        breaks.put("max", 0);
        scores
                .forEach(score -> {
                    if (records.isEmpty()) {
                        records.put("min", score);
                        records.put("max", score);
                    }
                    else {
                        if (score < records.get("min")) {
                            records.replace("min", score);
                            breaks.computeIfPresent("min", (key, oldValue) -> ++oldValue);
                        }
                        else if (score > records.get("max")) {
                            records.replace("max", score);
                            breaks.computeIfPresent("max", (key, oldValue) -> ++oldValue);
                        }
                    }
                });
        return List.of(breaks.get("max"), breaks.get("min"));
    }
}
