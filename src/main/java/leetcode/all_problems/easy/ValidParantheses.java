package leetcode.all_problems.easy;

import java.util.List;
import java.util.Stack;

public class ValidParantheses {
    private static final List<Character> openParantheses = List.of('(', '[', '{');
    private static final List<Character> closedParantheses = List.of(')', ']', '}');

    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            Character parenthesis = s.charAt(i);
            if (isOpen(parenthesis)) {
                stack.push(parenthesis);
            }
            else {
                if (stack.isEmpty()) {
                    return false;
                }
                else if (closes(stack.peek(), parenthesis)) {
                    stack.pop();
                }
                else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }

    private boolean isOpen(Character parenthesis) {
        return openParantheses.contains(parenthesis);
    }

    private boolean closes(Character open, Character closed) {
        return openParantheses.indexOf(open) == closedParantheses.indexOf(closed);
    }
}
