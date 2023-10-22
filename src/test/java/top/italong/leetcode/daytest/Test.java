package top.italong.leetcode.daytest;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/10/22 17:21
 */
public class Test {
    public String longestPalindrome(String s) {
        int size = s.length();
        String ans = "";
        int max = 0;
        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                String test = s.substring(i,j);
                if (average(test) && test.length() > max){
                    ans = test;
                    max = Math.max(ans.length(),max);
                }
            }
        }
        return ans;
    }

    private boolean average(String s) {
        int size = s.length();
        for (int i = 0; i < size / 2; i++) {
            if (s.charAt(i) == s.charAt(size-i-1)){
                return true;
            }
        }
        return false;
    }
}
