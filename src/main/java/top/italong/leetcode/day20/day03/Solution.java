package top.italong.leetcode.day20.day03;

/**
 * Create by Idea
 * 13.罗马数字转整数
 * @Author along
 * @create 2023/8/29 22:01
 */
public class Solution {
    private int match(char x){
    if(x == 'I')	return 1;
    if(x == 'V')	return 5;
    if(x == 'X')	return 10;
    if(x == 'L')	return 50;
    if(x == 'C')	return 100;
    if(x == 'D')	return 500;
    return 1000;
}
    public int romanToInt(String s) {
        int res = 0;
        for(int i = 0;i < s.length();i++){
            if(i != s.length() - 1 && match(s.charAt(i)) < match(s.charAt(i + 1)))
                res -= match(s.charAt(i));
            else
                res += match(s.charAt(i));
        }
        return res;
    }
}
