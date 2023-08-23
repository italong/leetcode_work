package top.italong.leetcode.day10.day03;

/**
 * Create by Idea
 *  给定一个字符串 s ，请你找出其中不含有重复字符的 最长子串 的长度。
 * @Author along
 * @create 2023/8/16 16:59
 */
public class Solution {
    public int lengthString(String s){
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            boolean[] book = new boolean[300];
            for (int j = i; j >= 0; j--) {
              if (book[s.charAt(j)]) {
                  break;
              }
              book[s.charAt(j)] = true;
              count = Math.max(count,i-j+1);
            }
        }
        return count;
    }
}
