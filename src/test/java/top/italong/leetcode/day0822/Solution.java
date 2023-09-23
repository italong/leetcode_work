package top.italong.leetcode.day0822;

import java.util.Scanner;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/22 19:54
 */
public class Solution {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int v = sc.nextInt();
        int n = sc.nextInt();
        int[] res = new int[n];
        for (int i = 0; i < n; i++) {
            res[i] = sc.nextInt();
        }
        for (int i = 0; i < n-1; i++) {
            for (int j = i; j < n-1; j++) {
                if (res[i] < res[j]){
                    int mid = res[i+1];
                    res[i] = res[j];
                    res[j] = mid;
                }
            }
        }
        int count = 0;
        for (int i = 0; i < n; i++) {
            if (count == v){
                break;
            }
            if (count <= v){
                count += res[i];
            }
            if (count > v){
                count -= res[i];
                break;
            }
        }

        System.out.println(v-count);
    }
}
