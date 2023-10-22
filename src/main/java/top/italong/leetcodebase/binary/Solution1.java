package top.italong.leetcodebase.binary;

class Solution1 {
    /**
     * 二分查找
     * @param n int整型 数组长度
     * @param v int整型 查找值
     * @param a int整型一维数组 有序数组
     * @return int整型
     */
    public int upper_bound_ (int n, int v, int[] a) {
        int left = 0 ;
        int right = n;
        while(left < right){
            int mid = left + (right - left)/2;
            if(a[mid] >= v){
                right = mid;
            }else{
                left = left + 1;
            }
        }
        return (left == n) ? n+1 : left+1;
    }
}