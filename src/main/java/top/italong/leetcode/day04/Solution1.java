package top.italong.leetcode.day04;

import java.util.Arrays;

/**
 * Create by Idea
 *4.寻找两个正序数组的中位数
 * @Author along
 * @create 2023/8/17 14:14
 */
public class Solution1 {
    /**
     * 常规思路 先合并排序再取中间值
     * @param num1
     * @param num2
     * @return
     */
    public double findmediasortArray(int[] num1,int[] num2){
        int[] arr = new int[num1.length + num2.length];
        System.arraycopy(num1,0,arr,0,num1.length);
        for (int i = 0; i < num2.length; i++) {
            arr[i+num1.length] = num2[i];
        }
        Arrays.sort(arr);
        int num = arr[arr.length/2];
        if ((arr.length/2&1)==1){
            return num*1.0;
        }else {
            return (num+arr[arr.length/2-1])/2.0;
        }
    }
}
