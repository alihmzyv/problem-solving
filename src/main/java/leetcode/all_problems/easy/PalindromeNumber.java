package leetcode.all_problems.easy;

//https://leetcode.com/problems/palindrome-number/
public class PalindromeNumber {
    //converting to String
    public boolean isPalindrome(int x) {
        if (x < 0) {
            return false;
        }
        String str = String.valueOf(x);
        return new StringBuilder(str).reverse().toString().equals(str);
    }
}
