package leetcode.all_problems.easy;

//https://leetcode.com/problems/add-digits/
public class AddDigits {
    public int addDigits(int num) {
        while (!hasOneDigit(num)) {
            num = sumDigits(num);
        }
        return num;
    }

    private int sumDigits(int num) {
        int sum = 0;
        int tempNum = num;
        while (tempNum > 0) {
            sum += tempNum % 10;
            tempNum /= 10;
        }
        return sum;
    }

    private boolean hasOneDigit(int num) {
        return num / 10 == 0;
    }
}
