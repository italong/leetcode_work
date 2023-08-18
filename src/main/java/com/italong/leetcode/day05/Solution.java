package com.italong.leetcode.day05;

/**
 * Create by Idea
 * 5.最长回文子串
 * @Author along
 * @create 2023/8/18 21:21
 */
public class Solution {
    boolean isPalindrome(String s,int begin,int end){
        while(begin <= end){
            if(s.charAt(begin) != s.charAt(end))
                return false;
            begin++;
            end--;
        }
        return true;
    }
    public String longestPalindrome(String s) {
        int ansl = 0, ansr = 0;
        for (int i = 0; i < s.length(); i++)
            for (int j = i; j < s.length(); j++)
                if (isPalindrome(s, i, j)) {
                    if (j - i > ansr - ansl) {
                        ansr = j;
                        ansl = i;
                    }
                }
        return s.substring(ansl, ansr + 1);
    }
}
