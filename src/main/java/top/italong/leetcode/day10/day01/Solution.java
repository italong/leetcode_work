package top.italong.leetcode.day10.day01;

/**
 * Create by Idea
 * 两数之和
 * @Author along
 * @create 2023/8/14 19:12
 */
public class Solution {
    /**
     * 1.暴力破解
     * @param nums
     * @param target
     * @return
     */
    public int[] twoSum(int[] nums, int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+ nums[j]==target){
                    return new int[]{i,j};
                }
            }
        }
        throw new IllegalArgumentException("No two sum solution");
    }


}
