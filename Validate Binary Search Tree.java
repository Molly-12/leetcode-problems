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
    public boolean isValidBST(TreeNode root) {
      Stack<TreeNode> st=new Stack();
      double left_childVal=-Double.MAX_VALUE;
      
      while(!st.isEmpty() || root!=null){
        while(root!=null){
          st.push(root);
          root=root.left;
        }
        root=st.pop();
        if(root.val<=left_childVal) return false;
        left_childVal=root.val;
        root=root.right;
      }
    }
  return true;
}
