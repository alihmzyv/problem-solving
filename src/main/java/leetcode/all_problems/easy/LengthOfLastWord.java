package leetcode.all_problems.easy;

public class LengthOfLastWord {
    public int lengthOfLastWord(String s) {
        String[] words = s.split("\\s+");
        return words[words.length - 1].length();
    }
}
