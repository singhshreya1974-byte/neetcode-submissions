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
    public List<Integer> rightSideView(TreeNode root) {
        List<Integer> ans=new ArrayList<>();
        if(root==null) return ans;
        level(root,ans,0);
        return ans;
        
        
    }
    public void level(TreeNode root,List<Integer> ans,int lvl){
        if(root==null) return ;

        if(lvl>=ans.size()) ans.add(root.val);

        level(root.right,ans,lvl+1);
        level(root.left,ans,lvl+1);
        
    }
}
