package top.italong.leetcode.day20.day04;

/**
 * Create by Idea
 * 14、最长公共前缀
 * 编写一个方法来查找字符串数组中的最长公共前缀。
 * 如果不存在公共前缀，返回空字符串 ""
 * @Author along
 * @create 2023/8/31 22:26
 */
public class Solution {
    private int[][] cnt = new int[210][30];
    public String longestCommonPrefix(String[] strs){
        for (String str : strs) {
            for (int j = 0; j < str.length(); j++) {
                cnt[j][str.charAt(j) - 'a']++;
            }
        }
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < strs[0].length(); i++) {
            if (cnt[i][strs[0].charAt(i) - 'a'] != strs.length)
                break;
            res.append(strs[0].charAt(i));
        }
        return res.toString();
    }
}
