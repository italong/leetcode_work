package top.italong.leetcode.day11.day01;

/**
 * Create by Idea
 * 11.盛最多的水
 * @Author along
 * @create 2023/8/27 21:11
 */
public class Solution {
    /**
     * 暴力破解
     * @param height
     * @return
     */
    public int maxArea(int[] height){
        int res = 0;
        for (int i = 0;i < height.length;i++){
            for (int j = 0; j < height.length; j++) {
                res = Math.max(res,(j-i) * Math.min(height[i],height[j]));
            }
        }
        return res;
    }
}
