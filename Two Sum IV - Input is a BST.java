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
    public boolean findTarget(TreeNode root, int k) {
      List<Integer> num=new ArrayList<>();
      inorder(root,num);
      int left=0;
      int right=num.size()-1;
      while(left<right){
        if(num.get(left)+num.get(right)==k)
          return true;
        if(num.get(left)+num.get(right)<k)
          left++;
        else
          right--;
      }
      return false;
    }
  public void inorder(TreeNode root, List<Integer> num){
    if(root==null)
      return;
    inorder(root.left,num);
    num.add(root.val);
    inorder(root.right,num);
  }
}
      
