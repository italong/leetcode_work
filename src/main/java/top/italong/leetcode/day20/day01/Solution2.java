package top.italong.leetcode.day20.day01;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/8/27 21:38
 */
public class Solution2 {
    public int maxArea(int[] height){
        int lef = 0,rig = height.length - 1;
        int res = 0;
        while(lef <= rig){
            res = Math.max(res,(rig - lef) * Math.min(height[lef],height[rig]));
            if(height[lef] <= height[rig])
                lef++;
            else
                rig--;
        }
        return res;
    }
}
