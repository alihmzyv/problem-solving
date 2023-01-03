package leetcode.all_problems.easy;

//https://leetcode.com/problems/remove-element/
public class RemoveElement {
    public int removeElement(int[] nums, int val) {
        int pointer = 0;
        for (int i = 0; i < nums.length; i++) {
            int num = nums[i];
            if (num != val) {
                nums[pointer++] = num;
            }
        }
        return pointer;
    }
}
