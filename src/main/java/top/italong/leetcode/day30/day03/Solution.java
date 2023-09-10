package top.italong.leetcode.day30.day03;

import top.italong.leetcode.day10.day02.ListNode;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

/**
 * Create by Idea
 * 23leetcode_day23合并k个升序序列链表
 * @Author along
 * @create 2023/9/9 19:18
 */
public class Solution {
    static Comparator<ListNode> cmp = new Comparator<ListNode>() {
        @Override
        public int compare(ListNode o1, ListNode o2) {
            //重写compare()方法，自定义PriorityQueue内部顺序
            return Integer.compare(o1.val, o2.val);
        }
    };
    public ListNode mergeKLists(ListNode[] kList) {
        ListNode res = new ListNode();
        // 一个空的头节点
        ListNode head = res;
        // 一个空的优先级队列
        Queue<ListNode> que = new PriorityQueue<>(cmp);

        // 依次将 K 个链表的头节点添加进PriorityQueue
        // 这样就能找出来最小的那一个
        // 假如输入的是[[1,4,5],[1,3,4],[2,6]]
        // 此时会对这三个链表进行排序，头节点肯定是数值为 1 的这个节点
        for (ListNode listNode : kList)
            if (listNode != null)
                que.add(listNode);

        // 开始遍历队列
        while(!que.isEmpty()){
            // 取出PriorityQueue的队首元素（为所有链表中的最小节点）
            ListNode nowPos = que.poll();
            // 把最小的节点放在空链表的第二位
            res.next = nowPos;
            // 向后移动
            res = res.next;
            // 如果这个链表还没有访问完，则加入PriorityQueue中继续访问
            //
            if(nowPos.next != null)
                que.add(nowPos.next);
        }
        // 返回排序后的新链表，从空节点的下一个开始
        return head.next;
    }
}
