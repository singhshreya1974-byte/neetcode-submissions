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
    int good=0;
    public int goodNodes(TreeNode root) {
        gud(root,Integer.MIN_VALUE);
        return good;
    }
    public  void gud(TreeNode root,int max){
        if(root==null) return ;
        if(root.val>=max){
            good++;
            max=root.val;
        }
        gud(root.left,max);
        gud(root.right,max);
    }
}
