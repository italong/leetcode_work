package top.italong.leetcode.day01;

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
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            int sub = target - nums[i];
            if (map.containsKey(sub))
                return new int[]{i, map.get(sub)};
                map.put(nums[i], i);
        }
        throw new IllegalArgumentException("No two sum solution");
    }
}
