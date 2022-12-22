package leetcode.all_problems.easy;

import java.util.Arrays;

public class RemoveDublicatesFromSortedArray {
    public int removeDuplicates(int[] nums) {
        int[] distinct = Arrays.stream(nums)
                .distinct()
                .toArray();
        System.arraycopy(distinct, 0, nums, 0, distinct.length);
        return distinct.length;
    }
}
