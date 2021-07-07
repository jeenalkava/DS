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
    public int kthSmallest(TreeNode root, int k) {
       int []ans=new int[2];
        inorder(root,ans,k);
        return ans[1];
        
    }
    public void inorder(TreeNode root,int[] ans,int k)
    {
        if(root==null)
            return;
        
        inorder(root.left,ans,k);
        
         if(++ans[0]==k)
         {
            ans[1]=root.val;
            return;
         }
        
        inorder(root.right,ans,k);
    }
}
