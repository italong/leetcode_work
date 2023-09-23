package top.italong.leetcode.day0921;

import java.util.HashMap;
import java.util.Scanner;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/21 19:55
 */
public class Solution2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        HashMap<String, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < n; i++) {
            hashMap.put(scanner.next(),i);
        }
        if (hashMap.size() == 1){
            System.out.println(1);
        }

    }
}
