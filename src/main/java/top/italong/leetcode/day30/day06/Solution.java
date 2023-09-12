package top.italong.leetcode.day30.day06;

/**
 * Create by Idea
 * 26.删除有序数组中的重复项
 * @Author along
 * @create 2023/9/12 20:43
 */
public class Solution {
    public int removeDuplicates(int[] nums) {
        int i = 0,j=0;
        int[] res = new int[nums.length];
        for (; i < nums.length; i++) {
            if (nums[i] != nums[j]){
                nums[++j] = nums[i];
            }
        }
        return j+1;
    }

}
