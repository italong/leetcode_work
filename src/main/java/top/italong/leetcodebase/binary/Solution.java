package top.italong.leetcodebase.binary;

/**
 * Create by Idea
 * 1.二分查找 ： 请实现有重复数字的升序数组的二分查找。
 * 输出在数组中第一个大于等于查找值的位置（下标从1开始算起）
 * 如果数组中不存在这样的数(指不存在大于等于查找值的数)，则输出数组长度加一
 * @Author along
 * @create 2023/8/25 21:00
 */
public class Solution {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        v = v - 1;  //从0开始
        int left = 0,right = n - 1;
        while (left <= right){
            int mid = (left + right) / 2;
            if (v >= a[mid]){
                left = mid;
            }else {
                right = mid;
            }
        }
        //最后返回下标..
        if (left <= n-1){
            return left + 1;
        }else {
            return n+1;
        }
    }
}
