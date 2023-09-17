package top.italong.leetcode.day60.day05;

/**
 * Create by Idea
 *
 * @Author along
 * @create 2023/9/17 20:41
 */
public class Solution {
     public class TreeNode {
         int val;
         TreeNode left;
         TreeNode right;
         TreeNode(int x) { val = x; }
    }


    public int maxDepth(TreeNode root) {
        if (root ==null) return 0;
        int lef = maxDepth(root.left);
        int rig = maxDepth(root.right);
        return Math.max(lef,rig)+1;
    }
}
