package leetcode.all_problems.easy;

import java.util.Arrays;

//https://leetcode.com/problems/two-sum/
public class TwoSum {
    //there is only one solution always
    public static int[] twoSum(int[] nums, int target) {
        int[] result = new int[2];
        outer:
        for (int i = 0; i <= nums.length - 2; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    break outer;
                }
            }
        }
        return result;
    }
}
