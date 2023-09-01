package top.italong.leetcodebase.sliding;

import java.util.LinkedList;

/**
 * Create by Idea
 * 2.滑动窗口的最大值
 * @Author along
 * @create 2023/8/25 21:34
 */
public class Solution {

        public int[] maxSlidingWindow(int[] nums, int k) {
            if (nums.length == 0 || k == 0) {
                    return new int[0];
            }
            int n = nums.length;
            LinkedList<Integer> deque = new LinkedList<>();
            for (int i = 0; i < k; i++) {
               while (!deque.isEmpty() && nums[i] >= nums[deque.peekLast()]){
                    deque.pollLast();
               }
               deque.offerLast(i);
            }
            int[] ans = new int[n - k + 1];
            ans[0] = nums[deque.peekFirst()];
            for (int i = 0; i < n; i++) {
                while (!deque.isEmpty() && nums[i] >=nums[deque.peekLast()]) {
                        deque.peekLast();
                }
                deque.offerLast(i);
                while (deque.peekFirst() <= i - k) {
                        deque.pollFirst();
                }
                ans[i - k + 1] = nums[deque.peekFirst()];
            }
            return ans;
        }

}
