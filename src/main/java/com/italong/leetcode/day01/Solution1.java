package com.italong.leetcode.day01;

import java.util.HashMap;

/**
 * Create by Idea
 * 两数之和
 * @Author along
 * @create 2023/8/14 19:12
 */
public class Solution1 {

    /**
     * 第一次循环会遍历全部，通过hashmap存取之前的值，比较i之前的和i之后的和来遍历
     * @param sums
     * @param target
     * @return
     */
    public int[] twoSum(int[] sums,int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < sums.length; i++) {
            int sub = target - sums[i];
            if (map.containsKey(sub))
                return new int[]{i, map.get(sub)};
                map.put(sums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
