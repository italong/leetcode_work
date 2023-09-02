package top.italong.leetcode.day20.day06;

import java.util.Arrays;

/**
 * Create by Idea
 * 16.最接近的三数之和
 * @Author along
 * @create 2023/9/2 14:37
 */
public class Solution {
    public int  threeSumClosest(int[] nums, int target){
        if (target == 0)
            return 0;
        int res = Integer.MAX_VALUE;
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if (i > 0 && nums[i] == nums[i -1])
                continue;
            int lef = i + 1,rig = nums.length - 1;
            while (lef < rig) {
                if (Math.abs(nums[i] + nums[lef] + nums[rig] - target) < Math.abs(res - target)){
                    res = nums[i] + nums[lef] + nums[rig];
                    while (lef < rig && nums[lef] == nums[lef + 1]) lef++;
                    while (lef < rig && nums[rig] == nums[rig - 1]) rig--;
                }
                if (res == target)
                    return res;
                if (nums[i] + nums[lef] +nums[rig] < target)
                    lef++;
                else
                    rig--;
            }
        }
        return res;
    }
}
