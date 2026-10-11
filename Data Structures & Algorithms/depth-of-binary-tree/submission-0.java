/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */

class Solution {
    
    public int maxDepth(TreeNode root) {
        return deep(root,0);
    }
    public static int deep(TreeNode root,int d){
        if(root==null){
            return 0;
        }
        int lft=deep(root.left,d);
        int ryt=deep(root.right,d);
        d=Math.max(lft,ryt)+1;
        return d;
    }
}
