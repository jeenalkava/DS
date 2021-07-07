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
     List<Integer> list=new ArrayList<>();
    public TreeNode balanceBST(TreeNode root) {
       
        inOrder(root);
        int left=0;
        int right=list.size()-1;
        return balanceBST(left,right);
        
        
        
    }
    public TreeNode balanceBST(int left,int right)
    {
        if(left>right)
            return null;
        if(left==right)
            return new TreeNode(list.get(left));
        int mid=(right+left)/2;
        TreeNode result=new TreeNode(list.get(mid));
        result.left=balanceBST(left,mid-1);
        result.right=balanceBST(mid+1,right);
        return result;
    }
    public void inOrder(TreeNode root)
    {
        if(root==null)
            return;
        inOrder(root.left);
        list.add(root.val);
        inOrder(root.right);
            
        
    }
}
