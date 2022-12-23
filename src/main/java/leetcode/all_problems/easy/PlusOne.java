package leetcode.all_problems.easy;

public class PlusOne {
    public int[] plusOne(int[] digits) {
        for (int i = digits.length - 1; i >= 0; i--) {
            int digitAddResult = digits[i] + 1;
            if (digitAddResult == 10) {
                digits[i] = 0;
            }
            else {
                digits[i] = digitAddResult;
                break;
            }
        }
        if (digits[0] == 0) {
            int[] result = new int[digits.length + 1];
            result[0] = 1;
            System.arraycopy(digits, 0, result, 1, digits.length);
            return result;
        }
        return digits;
    }
}
