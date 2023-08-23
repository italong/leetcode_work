package top.italong.leetcode.day10.day06;

/**
 * Create by Idea
 * 6.Z字形变换
 * @Author along
 * @create 2023/8/21 15:16
 */
public class Solution {
    public String convert(String s, int numRows) {
        if (numRows == 1)
            return s;
        int[][] ans = new int[numRows + 1][s.length() + 1];
        int pos = 1,add = 1; //pos表示当前所在行数 add表示增量
        for (int i = 0; i < s.length(); i++) {
            if (pos == i)
                add = 1;
            else
                if (pos == numRows)
                    add = -1;
            ans[pos][++ans[pos][0]] = i;//用ans[pos][0]来存储所在行有多少字符
            pos = pos + add;//字符移动
        }
        StringBuilder res = new StringBuilder();
        for (int i = 1; i <= numRows; i++) {
            for (int j = 1; j <= ans[i][0]; j++) {
                res.append(ans[i][j]);
            }
        }
        return res.toString();
    }

}
