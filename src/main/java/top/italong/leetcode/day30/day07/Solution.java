package top.italong.leetcode.day30.day07;

/**
 * Create by Idea
 * 27.移除元素
 * @Author along
 * @create 2023/9/13 22:35
 */
public class Solution {
    public int removeElement(int[] nums, int val) {
        int i = 0,j=0;
        for (; i < nums.length; i++) {
            if (nums[i] ==val)
                nums[j++] = nums[i];
        }
        return j;
    }
}
