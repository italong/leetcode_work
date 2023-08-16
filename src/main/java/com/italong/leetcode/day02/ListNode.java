package com.italong.leetcode.day02;

/**
 * Create by Idea
 *您将得到两个表示两个非负整数的非空链表。这些数字按反向顺序存储，并且每个
 * 它们的节点包含一个数字。添加这两个数字并将其作为链接列表返回。
 * 您可以假设这两个数字不包含任何前导零，除了数字0本身。
 * 例
 * 输入：(2->4->3)+(5->6->4)
 * 产出：7->0->8
 * 说明：342+465=807。
 * @Author along
 * @create 2023/8/15 19:10
 */
public class ListNode {
    int val;
    ListNode next;
    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    public ListNode() {
    }

    public ListNode(int val) {
        this.val = val;
    }
}
class Solution{
    public ListNode Solution(ListNode listNode1,ListNode listNode2){
        ListNode temp = new ListNode(0);
        ListNode res = temp;
        ListNode p = listNode1,q = listNode2;
        int up = 0;
        while (p != null || q != null){
            int addX = p == null ? 0 : p.val;
            int addY = q == null ? 0 : q.val;
            int sum = addX + addY + up;
            temp.next = new ListNode(sum % 10);
            up = sum / 10;
            if (p != null) {
                p = p.next;
            }
            if (q != null) {
                q = q.next;
                temp = temp.next;
            }
        }
        if (up > 0) {
            temp.next = new ListNode(up);
        }
        return temp.next;
    }
}