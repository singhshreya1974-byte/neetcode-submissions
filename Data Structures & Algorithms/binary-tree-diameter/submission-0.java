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
    int d=0;
    public int diameterOfBinaryTree(TreeNode root) {
        deep( root);
        return d;
    }
    public  int deep(TreeNode root){
        if(root==null){
            return 0;
        }
        int lft=deep(root.left);
        int ryt=deep(root.right);
        d=Math.max(d,lft+ryt);
        return Math.max(lft,ryt)+1;
    }
}
