package top.italong.leetcode.day10.day10;

/**
 * Create by Idea
 * 10.正则表达式匹配
 * @Author along
 * @create 2023/8/25 19:05
 */
public class Solution {
    public boolean isMatch(String s,String p){
        int n = s.length(),m=p.length();
        boolean[][] f = new boolean[n + 1][m + 1];
        f[0][0] = true;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (p.charAt(j - 1) == '*'){
                    if (i != 0
                    &&(p.charAt(j-2) == '.' || s.charAt(i-1) == p.charAt(j-2)))
                        f[i][j] = f[i][j-2] || f[i-1][j];
                    else
                        f[i][j] = f[i][j-2];
                }else{
                     if (i != 0
                     && (p.charAt(j-1) == '.' || s.charAt(i-1) == p.charAt(j-1)))
                         f[i][j] = f[i-1][j-1];
                }
            }
        }
        return f[n][m];
    }

}
