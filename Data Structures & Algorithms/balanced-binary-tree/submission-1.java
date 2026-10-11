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
    public boolean isBalanced(TreeNode root) {
        return (bal(root)!=-1);
    }
    public static int bal(TreeNode root){
        if(root==null){
            return 0;
        }
        
        int lft=bal(root.left);

        if(lft==-1)  return -1;

        int ryt=bal(root.right);

        if(ryt==-1) return -1;

        if(Math.abs(lft-ryt)>1){
            return -1;
        }
        return Math.max(lft,ryt)+1;

    }
}
