package top.italong.leetcode.day0923;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/23 20:27
 */
public class Solution1 {
    public static void main(String[] args) {
        String s = "";
        boolean flag = isValidString(s);
        System.out.println(flag);
    }
    public static boolean isValidString(String s) {
        String[] arr = new String[s.length()];
        for (int i = 0; i < s.length(); i++) {
            arr[i] = String.valueOf(s.charAt(i));
        }
        int lef = 0;
        int rig = 0;
        int xin = 0;
        int[] res = new int[s.length()];
        if (arr[0].equals(")"))return false;
        for (int i = 0; i < s.length(); i++) {
            if (arr[i].equals("(")){
                lef++;
            }else if (arr[i].equals(")")){
                rig++;
            }else {
                xin++;
            }
        }
        if (lef == rig){
            return true;
        }else if (lef+xin == rig){
            return true;
        }else if (lef == rig+xin){
            return true;
        }else {
            return false;
        }
    }
}
