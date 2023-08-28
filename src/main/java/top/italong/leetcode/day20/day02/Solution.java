package top.italong.leetcode.day20.day02;

/**
 * Create by Idea
 * 12.整数转罗马数字
 * @Author along
 * @create 2023/8/28 13:07
 */
public class Solution {
    int[] nums = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
    String[] matchs = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};
    public String intToRoman(int num){
        StringBuilder res = new StringBuilder();
        for (int i = 0; i < nums.length; i++) {
            while (num >= nums[i]){
                num -= nums[i];
                res.append(matchs[i]);
            }
            if (num == 0)
                break;
        }
        return res.toString();
    }

}
