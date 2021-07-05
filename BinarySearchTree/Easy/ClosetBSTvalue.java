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
    public int closestValue(TreeNode root, double target) {
        return findClosetValue(root,target,Double.MAX_VALUE, root.val);
    }
    
    private int findClosetValue(TreeNode root,double target, double diff , int currentClosetValue)
    {
        if(root==null)
            return currentClosetValue;
        
        if(Math.abs(target-root.val)<diff)
        {
            diff=Math.abs(target-root.val);
            currentClosetValue=root.val;
        }
        if(target<root.val)
            return findClosetValue(root.left,target,diff,currentClosetValue);
        else 
            return findClosetValue(root.right,target,diff,currentClosetValue);
        
        
    }
}

Time : O(n)
Space : O(n)
