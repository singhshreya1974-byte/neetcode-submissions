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
    public boolean isSubtree(TreeNode root, TreeNode subroot) {
        if(root==null) return false;
        if(subroot==null) return true;

        if(same(root,subroot)) return true;

        return isSubtree(root.left ,subroot) || isSubtree(root.right,subroot);
    }
    public static boolean same(TreeNode p,TreeNode q){
        if(p==null && q==null){
            return true;

        }
        if(p==null || q==null){
            return false;
        }

        if(p.val!=q.val){
            return false;
        }
        boolean lft=same(p.left,q.left);
        boolean ryt=same(p.right,q.right);

        return lft && ryt;
    }
}
