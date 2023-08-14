package com.italong.leetcode.day01;

/**
 * Create by Idea
 * 两数之和
 * @Author along
 * @create 2023/8/14 19:12
 */
public class Solution {
    /**
     * 1.暴力破解
     * @param sums
     * @param target
     * @return
     */
    public int[] twoSum(int[] sums,int target){
        for (int i = 0; i < sums.length; i++) {
            for (int j = i+1; j < sums.length; j++) {
                if (sums[i]+sums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
