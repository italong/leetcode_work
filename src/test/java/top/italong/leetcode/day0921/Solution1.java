package top.italong.leetcode.day0921;

import java.util.Scanner;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/21 19:11
 */
public class Solution1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        boolean[] book = new boolean[128];
        int res = 0;
        for (int i = 0; i < n; i++) {
            res = sc.nextInt();
            if (!book[res]){
                book[res] = true;
            }
        }

        for (int i = 0; i < book.length; i++) {
            if (book[i]){
                System.out.print(i + " ");
            }
        }
    }
}
