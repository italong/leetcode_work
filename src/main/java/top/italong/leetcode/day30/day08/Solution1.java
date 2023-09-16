package top.italong.leetcode.day30.day08;

/**
 * Create by Idea
 * 28.实现strStr()
 * @Author along
 * @create 2023/9/16 11:13
 */
public class Solution1 {
    public static void main(String[] args) {
        String test = "mississippi";
        String test2 = "issipi";
        System.out.println(test.substring(0,test2.length()));
        System.out.println(subStr(test,test2));
    }
    public static int subStr(String haystack,String needle){
        if (haystack.length() < needle.length()) return 0;
        for (int i = 0; i < haystack.length(); i++) {
            if (haystack.charAt(i) == needle.charAt(0)){
                String count = haystack.substring(i,i+needle.length());
                if (count.equals(needle)) {
                    return i;
                }
                if (i+needle.length() > haystack.length()){
                    return -1;
                }
            }
        }
        return -1;
    }
}
