package com.italong.leetcode.day06;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/8/21 16:11
 */
public class Solution1 {


    public String convert(String s,int numRows){
         if (numRows == 1)
             return s;
        char[][] ans = new char[numRows + 1][s.length() + 1];
        for (int i = 1; i < s.length(); i++) {
            int pos = rowInZ(i,numRows);
            ans[pos][++ans[pos][0]] = s.charAt(i-1);
        }
        StringBuilder res = new StringBuilder();
        for (int i = 1; i < numRows; i++) {
            for (int j = 1; j <= ans[i][0];j++)
                res.append(ans[i][j]);
        }
        return res.toString();
    }

    private int rowInZ(int pos, int numRows) {
        int x = pos % (2 * numRows -2);
        if (x == 0)
            x = 2 * numRows -2;
        if (x <=numRows)
            return x;
        return 2 * numRows -x;
    }
}
