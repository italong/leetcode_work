package top.italong.leetcode.day20.day05;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by Idea
 * 15.三数之和
 * @Author along
 * @create 2023/9/1 14:36
 */
public class Solution {
    public List<List<Integer>> threeSum(int[] nums){
        ArrayList<List<Integer>> res = new ArrayList<>();
        Arrays.sort(nums);
        for (int i = 0; i < nums.length; i++) {
            if ( i > 0 && nums[i] == nums[i-1])
                continue;
            if (nums[i] > 0)
                break;
            int lef = i + 1;
            int rig = nums.length - 1;
            while (lef < rig){
                if (nums[i] + nums[lef] + nums[rig] < 0){
                    lef++;
                }else{
                    if (nums[i] + nums[lef] + nums[rig] == 0){
                        res.add(Arrays.asList(nums[i],nums[lef],nums[rig]));
                        while (lef < rig && nums[lef] == nums[lef + 1]) lef++;
                        while (lef < rig && nums[rig] == nums[rig - 1]) rig--;
                        lef++;
                    }
                    rig--;
                }
            }
        }
        return res;
    }

}
