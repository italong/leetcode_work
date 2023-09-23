package top.italong.leetcode.day0923;


/*
 * public class ListNode {
 *   int val;
 *   ListNode next = null;
 *   public ListNode(int val) {
 *     this.val = val;
 *   }
 * }
 */

public class Solution {
      public static class ListNode {
          int val;
          ListNode next = null;

          public ListNode(int val) {
              this.val = val;
          }
      }
      public static void main(String[] args) {
            ListNode head = new ListNode(3);
            head.next = new ListNode(2);
            head.next.next = new ListNode(1);
            int k = 2;
            ListNode res = rotateLinkedList(head,k);
            System.out.println(res);
      }

          /**
           * 代码中的类名、方法名、参数名已经指定，请勿修改，直接返回方法规定的值即可
           *
           * @param head ListNode类
           * @param k    int整型
           * @return ListNode类
           */
          public static ListNode rotateLinkedList(ListNode head, int k) {
              if (k == 1){
                  ListNode res = head;
                  int num = 0;
                  if (k == 0) return res;
                  num = head.next.val;
                  head.next.val = head.val;
                  head.val = num;
                  head = head.next;
                  head.next = rotateLinkedList(head,k-1);
                  return res;
              }else if (k == 0){
                  return head;
              }
            return head;
          }

}