package com.italong.leetcode.day05;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/8/19 9:33
 */
public class Solution1 {
    /**
     * DP解法
     * @param s
     * @return
     */
    public String longestPalindrome(String s) {
        String rev = new StringBuffer(s).reverse().toString();
        int n = s.length();
        int[][] f = new int[n][n];
        int maxLen = 1;
        int begPos = 0;
        for(int j = 0;j < n;j++)
            if(rev.charAt(j) == s.charAt(0))
                f[0][j] = 1;
        for(int i = 1;i < n;i++){
            f[i][0] = s.charAt(i) == rev.charAt(0) ? 1 : 0;
            for(int j = 1;j < n;j++){
                if(s.charAt(i) == rev.charAt(j))
                    f[i][j] = f[i - 1][j - 1] + 1;
                if(f[i][j] > maxLen){
                    int befPos = n - j - 1;
                    if(befPos + f[i][j] - 1 == i) {
                        maxLen = f[i][j];
                        begPos = befPos;
                    }
                }
            }
        }
        return s.substring(begPos,begPos + maxLen);
    }

}
