package lc_top_interview_150;

import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class _52_20_ValidParentheses {
    /*
        Example 1:
            Input: s = "()"
            Output: true

        Example 2:
            Input: s = "()[]{}"
            Output: true

        Example 3:
            Input: s = "(]"
            Output: false
     */
    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '[' || c == '{') {
                stack.push(c);
            } else {
                if (stack.isEmpty()) {
                    return false;
                }
                char top = stack.peek();
                if ((c == ')' && top == '(') || (c == ']' && top == '[') || (c == '}' && top == '{')) {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.isEmpty();
    }
    public static boolean isValid_0(String s) {
        Stack<Character> stack = new Stack<>();
        Map<Character, Character> mapping = new HashMap<>();
        mapping.put(')', '(');
        mapping.put('}', '{');
        mapping.put(']', '[');

        for (char c : s.toCharArray()) {
            if (mapping.containsValue(c)) {
                stack.push(c);
            } else if (mapping.containsKey(c)) {
                if (stack.isEmpty() || mapping.get(c) != stack.pop()) {
                    return false;
                }
            }
        }

        return stack.isEmpty();
    }
    public static void main(String[] args) {
        String s = "()[]{}";
        boolean res = isValid_0(s);
        System.out.println(res);
    }
}
