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
    long min1=Long.MAX_VALUE;
    long min2= Long.MAX_VALUE;
    private void dfs(TreeNode node){
        if(node==null)
            return;
        if(node.val<min1){
            min2=min1;
            min1=node.val;
        }
        if(node.val<min2 && node.val!=min1){
            min2=node.val;
        }
        
        dfs(node.left);
        dfs(node.right);
        
    }
    public int findSecondMinimumValue(TreeNode root) {
        dfs(root);
        if(min2==Long.MAX_VALUE)
            return -1;
        else{
            return (int) min2;
        }
    }
}
        
    
