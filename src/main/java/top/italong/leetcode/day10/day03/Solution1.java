package top.italong.leetcode.day10.day03;

import java.util.HashMap;

/**
 * Create by Idea
 * 3.滑动窗口解法
 * @Author along
 * @create 2023/9/7 15:48
 */
public class Solution1 {
    public int lengthString(String s){
        int count = 0;
        HashMap<Character, Integer> map = new HashMap<>();
        //i是头指针，j是尾指针
        for (int i = 0,j = 0; i < s.length(); i++) {
            //该字符出现过
            if (map.containsKey(i)){
                j = Math.max(j,map.get(s.charAt(i)));
            }
            count = Math.max(count,i-j+1);
            map.put(s.charAt(i),i+1);
        }
        return count;
    }
}
