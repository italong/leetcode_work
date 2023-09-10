package top.italong.leetcode.day30.day04;

import top.italong.leetcode.day10.day02.ListNode;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/10 21:13
 */
public class Solution {
    public ListNode swapPairs(ListNode nowPos) {
        if (nowPos == null || nowPos.next == null)
            return nowPos;
        ListNode newNode = nowPos.next;
        nowPos.next = swapPairs(newNode.next);
        newNode.next = nowPos;
        return newNode;
    }
}
