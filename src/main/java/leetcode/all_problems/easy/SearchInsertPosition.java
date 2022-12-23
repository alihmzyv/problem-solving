package leetcode.all_problems.easy;

import java.util.Arrays;

public class SearchInsertPosition {
    public int searchInsert(int[] nums, int target) {
        int index = Arrays.binarySearch(nums, target);
        if (index < 0) {
            index = - (index + 1);
        }
        return index;
    }
}
