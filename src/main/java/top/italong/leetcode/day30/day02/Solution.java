package top.italong.leetcode.day30.day02;

import java.util.ArrayList;
import java.util.List;

/**
 * Create by Idea
 * 22.括号生成
 * @Author along
 * @create 2023/9/8 23:02
 */
public class Solution {
    List<String> res = new ArrayList<>();
    void DFS(int numLef,int numRig,int numTot,String sta){
        if(numRig == numTot){
            res.add(sta);
            return ;
        }
        if(numRig < numLef)
            DFS(numLef,numRig + 1,numTot,sta + ")");
        if(numLef < numTot)
            DFS(numLef + 1,numRig,numTot,sta + "(");
    }
    public List<String> generateParenthesis(int n) {
        DFS(0,0,n,"");
        return res;
    }
}
