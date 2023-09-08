package top.italong.leetcode.day30.day01;

import top.italong.leetcode.day10.day02.ListNode;

/**
 * Create by Idea
 * 21.合并两个有序序列
 * @Author along
 * @create 2023/9/7 14:34
 */
public class Solution {
    public ListNode mergeTwoLists(ListNode node1, ListNode node2) {
        if (node1 == null)
            return node2;
        else
            if (node2 == null)
                return node1;
            else
                if (node1.val < node2.val){
                    node1.next = mergeTwoLists(node1.next,node2);
                    return node1;
                }else {
                    node2.next = mergeTwoLists(node1,node2.next);
                    return node2;
                }
    }
}
