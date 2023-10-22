package top.italong.leetcodebase.nums;

/**
 * Create by Idea
 * 421
 * @Author along
 * @create 2023/10/13 15:00
 */
public class Solution {
    public int findMaximumXOR(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] > max){
                    max = nums[i] + nums[j];
                }
            }
        }
        return max;
    }
}
