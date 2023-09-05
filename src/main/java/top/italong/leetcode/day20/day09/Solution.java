package top.italong.leetcode.day20.day09;

import top.italong.leetcode.day10.day02.ListNode;

/**
 * Create by Idea
 * 19.删除链表的倒数第n个节点
 * @Author along
 * @create 2023/9/5 14:37
 */
public class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        int siz = 0;
        ListNode realhead = new ListNode(0,head);
        ListNode pos = head;
        while (pos != null){
            siz++;
            pos = pos.next;
        }
        pos = realhead;
        for (int i = 1; i < siz - n + 1; i++) {
            pos = pos.next;
        }
        pos.next = pos.next.next;
        return realhead.next;
    }
}
