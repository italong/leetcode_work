package top.italong.leetcode.day08;

/**
 * Create by Idea
 * 8.字符串转换整数
 * @Author along
 * @create 2023/8/23 15:20
 */
public class Solution {
    public int myatoi(String s){
        s = s.trim();
        if (s.equals(""))
            return 0;
        if (!(s.charAt(0) >= '0' && s.charAt(0) <= '9') && (s.charAt(0) != '-' && s.charAt(0) != '+'))
            return 0;

        long res = 0;
        long f = 1;
        int pos = 0;
        while (pos < s.length() && (s.charAt(pos) <'0' || s.charAt(pos) >'9')){
            f = s.charAt(pos) == '-' ? -1 : 1;
            pos++;
            if (f == -1 || s.charAt(pos-1)=='+')
                break;
        }
        StringBuilder preworked = new StringBuilder();
        while (pos < s.length() && s.charAt(pos) >= '0' && s.charAt(pos) <='9'){
            preworked.append(s.charAt(pos));
            pos++;
        }
        String temp = preworked.toString();
        for (int i = 0; i < temp.length(); i++) {
            if (!(temp.charAt(i) <= '9' && temp.charAt(i) >= '0'))
                break;
            if (res > 2147483647)
                res = 2147483648L;
            res = res * 10 + (temp.charAt(i) - '0');
        }
        if (res >= 2147483647L){
            if (f == -1 && res >= 2147483648L)
                return -2147483648;
            else
            if (f == 1)
                return 2147483647;
            else
                return (int)f * (int)res;
        }
        return (int)(f * res);
    }
}
