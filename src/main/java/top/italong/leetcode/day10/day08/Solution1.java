package top.italong.leetcode.day10.day08;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/8/23 15:46
 */
public class Solution1 {

    /**
     * 整理思路抽出相同的
     * @param s
     * @return
     */
    public int myAtoi(String s){
        s = s.trim();
        if (s.equals(""))
            return 0;
        if (!isDigit(s.charAt(0)) && s.charAt(0) != '-' && s.charAt(0) != '+')
            return 0;
        long ans = 0L;
        long f = s.charAt(0) == '-' ? -1 : 1;
        int pos = !isDigit(s.charAt(0)) ? 1 : 0;
        while (pos < s.length() && isDigit(s.charAt(pos))) {
            ans = ans * 10 + (s.charAt(pos++) - '0');
            if (f == 1 && ans > 2147483647)
                return 2147483647;
            if (f == -1 && ans > 2147483648L)
                return -2147483648;
        }
        return (int)f * (int) ans;
    }

    private boolean isDigit(char x) {
        return x <= '9' && x >= '0';
    }
}
