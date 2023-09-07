package top.italong.leetcode.day20.day10;

import java.util.Stack;

/**
 * Create by Idea
 * 20.有效的括号
 * @Author along
 * @create 2023/9/6 21:56
 */
public class Solution {
    public boolean isValid(String s) {
        Stack<Character> st = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(' || s.charAt(i) == '[' || s.charAt(i) == '{')
                st.push(s.charAt(i));
            else
                if (st.size() == 0)
                    return false;
                char com = st.pop();
                if (com == '(' && s.charAt(i) == ')'
                || com == '[' && s.charAt(i) == ']'
                || com == '{' && s.charAt(i) == '}')
                    continue;
                else
                    return false;
        }
        return st.size() == 0;
    }


}
