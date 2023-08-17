package com.italong.leetcode.day04;

/**
 * Create by Idea
 * 4.寻找两个正序数组的中位数
 * @Author along
 * @create 2023/8/17 14:25
 */
public class Solution2 {
    /**
     * 思路二：通过归并排序完成，同时第k次就是第k大/小
     * 的排序
     * @param num1
     * @param num2
     * @return
     */
    public double findmediasortArray(int[] num1,int[] num2){
        int n = num1.length;
        int m = num2.length;
        boolean flag = ((m+n)%2)==0;
        int point1 = 0,point2 = 0;
        int remNum1 = 0,remNum2 = 0;
        for (int i = 0; i < (n + m) / 2; i++) {
            remNum2 = remNum1;
            if (point1 < n && (point2 >= n || num1[point1] < num2[point2]))
                remNum1 = num1[point1++];
            else
                remNum2 = num2[point2++];
        }
        if (flag)
            return (remNum1 + remNum2) / 2.0;
        return remNum1 * 1.0;
    }
}
