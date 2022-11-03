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
  int min=Integer.MAX_VALUE;
   public int minDiffInBST(TreeNode root) {
     List<Integer> l=new ArrayList<>();
     dfs(root,l);
     Collections.sort(l);
     int diff=0;
     for(int i=0;i<l.size()-1;i++){
       diff=Math.abs(l.get(i)-l.get(i+1));
       min=Math.min(min,diff);
     }
     return min;
     
   }
   private void dfs(TreeNode root,List<Integer>l){
     if(root==null)
       return;
     l.add(root.val);
     dfs(root.left,l);
     dfs(root,right,l);
   }
}
