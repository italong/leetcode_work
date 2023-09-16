package top.italong.leetcode.day30.day08;

/**
 * Create by Idea
 * 28.找出字符串中第一个匹配项的下标
 * @Author along
 * @create 2023/9/15 21:57
 */
public class Solution {
    private void getNext(String p,int[] next){
        next[0] = -1;
        int posK = -1,posJ = 0;
        while(posJ < p.length()){
            if(posK == -1 || p.charAt(posK) == p.charAt(posJ)){
                posJ++;
                posK++;
                next[posJ] = posK;
            }
            else
                posK = next[posK];
        }
    }
    public int strStr(String haystack, String needle) {
        int[] next = new int[needle.length()+1];
        getNext(needle,next);
        int posI = 0,posJ = 0;
        while(posI < haystack.length() && posJ < needle.length()){
            if(posJ == -1 || haystack.charAt(posI) == needle.charAt(posJ)){
                posI++;
                posJ++;
            }
            else{
                posJ = next[posJ];
            }
        }
        if(posJ == needle.length())
            return posI - posJ;
        return -1;
    }
}
