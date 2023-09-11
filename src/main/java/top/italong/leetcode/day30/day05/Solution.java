package top.italong.leetcode.day30.day05;

import top.italong.leetcode.day10.day02.ListNode;

/**
 * Create by Idea
 * 25.k个一组翻转链表
 * @Author along
 * @create 2023/9/11 20:30
 */
public class Solution {
    public ListNode reverseKGroup(ListNode head, int k){
        ListNode tail = head;
        for(int i = 1; i <= k;i++){
            if(tail == null)
                return head;
            tail = tail.next;
        }
        ListNode newHead = reverse(head,tail);
        head.next = reverseKGroup(tail,k);
        return newHead;
    }
    private ListNode reverse(ListNode head, ListNode tail){
        ListNode pos1 = new ListNode(),pos2 = new ListNode();
        while(head != tail){
            pos2 = head.next;
            head.next = pos1;
            pos1 = head;
            head = pos2;
        }
        return pos1;
    }
}
