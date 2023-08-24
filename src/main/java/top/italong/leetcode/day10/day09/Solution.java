package top.italong.leetcode.day10.day09;

/**
 * Create by Idea
 * 9.回文数
 * @Author along
 * @create 2023/8/24 21:31
 */
public class Solution {
    public boolean isPalindrome(int x){
        if (x <0)
            return false;
        if (x <10)
            return true;
        StringBuilder stringBuilder = new StringBuilder();
        while (x != 0){
            stringBuilder.append((char)((x % 10) + '0'));
            x /= 10;
        }
        String s = stringBuilder.toString();
        for (int i = 0; i < s.length() / 2; i++) {
            if (s.charAt(i) != s.charAt(s.length() - 1 -i))
                return false;
        }
        return true;
    }
}
