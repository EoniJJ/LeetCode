package leetcode.easy._020;

import java.util.Stack;

/**
 * Created by Arron on 2017/6/6.
 */
public class Solution {

    /*
    *
    *
    *
      Given a string containing just the characters '(', ')', '{', '}', '[' and ']', determine if the input string is valid.
      The brackets must close in the correct order, "()" and "()[]{}" are all valid but "(]" and "([)]" are not.
    * */

    public boolean isValid(String s) {
        //典型的栈问题，先进后出
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(') {
                stack.push(')');
            } else if (c == '[') {
                stack.push(']');
            } else if (c == '{') {
                stack.push('}');
            } else if (stack.isEmpty() || stack.pop() != c) {
                return false;
            }
        }
        return stack.isEmpty();
    }


    public static void main(String[] args) {
        Solution solution = new Solution();
        System.out.println(solution.isValid("()"));

    }
}
