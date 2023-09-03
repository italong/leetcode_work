package top.italong.leetcode.day20.day07;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Idea
 * 17.电话号码数字组合
 * @Author along
 * @create 2023/9/3 14:41
 */
public class Solution {
    private final String[] letterMap = {
            " ",   //0
            "",    //1
            "abc", //2
            "def", //3
            "ghi", //4
            "jkl", //5
            "mno", //6
            "pqrs",//7
            "tuv", //8
            "wxyz" //9
    };
    List<String> ans = new ArrayList<>();
    String message;
    String str;
    private void dfs(int step){
        if (step == message.length()){
            ans.add(str);
            return;
        }
        String temp =str;
        if (message.charAt(step) == '1')
            dfs(step + 1);
        else
            for (int i = 0; i < letterMap[message.charAt(step) - '0'].length(); i++) {
                str = temp;
                str = str + letterMap[message.charAt(step) - '0'].charAt(i);
                dfs(step + 1); //进入下一层
            }
    }
    public List<String> letterCombinations(String digits){
        if (digits.length() == 0)
            return ans;
        str = "";
        message = digits;
        dfs(0);
        return ans;
    }
}
