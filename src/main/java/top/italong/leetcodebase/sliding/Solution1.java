package top.italong.leetcodebase.sliding;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/19 22:17
 */
public class Solution1 {
    public static void main(String[] args) {
        int[] nums = new int[]{-5769,-7887,-5709,4600,-7919,9807,1303,-2644,1144,-6410,-7159,-2041,9059,-663,4612,-257,2870,-6646,8161,3380,6823,1871,-4030,-1758,4834,-5317,6218,-4105,6869,8595,8718,-4141,-3893,-4259,-3440,-5426,9766,-5396,-7824,-3941,4600,-1485,-1486,-4530,-1636,-2088,-5295,-5383,5786,-9489,3180,-4575,-7043,-2153,1123,1750,-1347,-4299,-4401,-7772,5872,6144,-4953,-9934,8507,951,-8828,-5942,-3499,-174,7629,5877,3338,8899,4223,-8068,3775,7954,8740,4567,6280,-7687,-4811,-8094,2209,-4476,-8328,2385,-2156,7028,-3864,7272,-1199,-1397,1581,-9635,9087,-6262,-3061,-6083,-2825,-8574,5534,4006,-2691,6699,7558,-453,3492,3416,2218,7537,8854,-3321,-5489,-945,1302,-7176,-9201,-9588,-140,1369,3322,-7320,-8426,-8446,-2475,8243,-3324,8993,8315,2863,-7580,-7949,4400};
        int k = 6;
        int[] arrs = maxSlidingWindow(nums,k);
        for (int i = 0; i < arrs.length; i++) {
            System.out.print(arrs[i]+ ",");
        }
        int[] tes = new int[]{-1485,-1486,-4530,-1636,-2088,-5295};
        int count = 0;
        for (int i = 0,j=0; i < tes.length; i++) {
            while(j < 6){
                if(count < tes[i+j]){
                    count=tes[i+j];
                }
                j++;
            }
            //System.out.println(count);
        }
        System.out.println(count);
    }
    public static int[] maxSlidingWindow(int[] nums, int k) {
        if (k == 1)return nums;
        int[] arr = new int[nums.length-k+1];//存最后输出的
        for (int i = 0,j=0; i < nums.length-k+1; i++) {
            arr[i] = nums[i];
            while(j < k){
                if(nums[i+j] > 0 && arr[i] < nums[i+j]){
                    arr[i] = nums[i+j];
                }
                j++;
            }
            j = 0;
        }
        return arr;
    }
}
