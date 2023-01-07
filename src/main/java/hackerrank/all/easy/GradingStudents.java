package hackerrank.all.easy;

import java.util.List;
import java.util.stream.Collectors;

public class GradingStudents {
    public static List<Integer> gradingStudents(List<Integer> grades) {
        return grades.stream()
                .map(GradingStudents::roundGrade)
                .collect(Collectors.toList());
    }

    private static int roundGrade(int grade) {
        int nextMultipleOfFive = (grade / 5 + 1) * 5;
        if (grade >= 38 && nextMultipleOfFive - grade < 3) {
            return nextMultipleOfFive;
        }
        return grade;
    }
}
