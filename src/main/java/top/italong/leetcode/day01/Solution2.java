package top.italong.leetcode.day01;

import java.util.HashMap;

/**
 * Create by Idea
 * 两数之和
 * @Author along
 * @create 2023/8/14 19:12
 */
public class Solution2 {
    /**
     * 1.暴力破解
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        HashMap<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i],i);
        }
        for (int i = 0; i < nums.length; i++) {
            int sub = target- nums[i];
            if (map.get(i)+map.get(i-1)==target){
                return new int[]{i,map.get(sub)};
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
