package leetcode.all_problems.easy;

import java.util.*;

//https://leetcode.com/problems/summary-ranges/
public class SummaryRanges {

    public List<String> summaryRanges(int[] nums) {
        if (nums.length == 0) {
            return Collections.emptyList();
        }
        Stack<Integer> consecutiveStack = new Stack<>();
        List<String> ranges = new ArrayList<>();
        Arrays.stream(nums)
                .forEach(num -> {
                    if (consecutiveStack.isEmpty() || consecutiveStack.peek() == num - 1) {
                        consecutiveStack.push(num);
                    }
                    else {
                        ranges.add(getRange(consecutiveStack));
                        consecutiveStack.push(num);
                    }
                });
        ranges.add(getRange(consecutiveStack));
        return ranges;
    }

    private String getRange(Stack<Integer> stack) {
        String result;
        if (stack.size() == 1) {
            result = String.format("%d", stack.pop());
        }
        else {
            result =  String.format("%d->%d", stack.firstElement(), stack.lastElement());
        }
        stack.clear();
        return result;
    }
}
