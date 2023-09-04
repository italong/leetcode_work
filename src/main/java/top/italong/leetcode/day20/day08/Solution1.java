package top.italong.leetcode.day20.day08;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Create by Idea
 *  18.四数之和
 * @Author along
 * @create 2023/9/4 9:56
 */
public class Solution1 {
    public List<List<Integer>> fourSum(int[] nums, int target) {
        ArrayList<List<Integer>> res = new ArrayList<>();
        if (nums.length <  4){
            return res;
        }
        Arrays.sort(nums);
        for (int i = 0; i < nums.length - 3; i++) {
            if (i > 0 && nums[i] == nums[i-1]){
                continue;
            }
            if ((long)nums[i]+nums[nums.length-3]+nums[nums.length-2]+nums[nums.length-1] < (long) target){
                continue;
            }
            if ((long)nums[i]+nums[i+1]+nums[i+2]+nums[i+3] > (long) target){
                break;
            }
            for (int j = i+1; j < nums.length - 2; j++) {
                if (j > i+1 && nums[j] == nums[j-1]){
                    continue;
                }
                int lef = j+1,rig = nums.length-1;
                while (lef < rig){
                    if ((long)nums[i]+nums[j]+nums[lef]+nums[rig] < (long) target){
                        lef++;
                    }else {
                        if ((long)nums[i]+nums[j]+nums[lef]+nums[rig] == (long) target){
                            res.add(Arrays.asList(nums[i]+nums[j]+nums[lef]+nums[rig]));
                            while (lef < rig && nums[lef] == nums[lef+1])lef++;lef++;
                            while (lef < rig && nums[rig] == nums[rig-1])rig--;rig--;
                        }else {
                            rig--;
                        }
                    }
                }

            }
        }
        return res;
    }
}
