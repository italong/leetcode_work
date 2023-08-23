package top.italong.leetcode.day10.day07;

import java.util.Scanner;

/**
 * Create by Idea
 * 7.整数反转
 * @Author along
 * @create 2023/8/22 8:55
 */
public class Solution {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int res = in.nextInt();
        System.out.println(res);
    }

    public int reserve(int x){
        int res = 0 ;
        while (x != 0){
            if (res > 2147482646 || res < -2147482647){
                res = res * 10 + ( x % 10 );
                x = x / 10;
            }
        }
        return res;
    }
}
