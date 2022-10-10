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
 



class Solution {
    public List<Double> averageOfLevels(TreeNode root) {
    List<Double> l=new ArrayList<>();
    Queue<TreeNode> q=new LinkedList<>();
    q.offer(root);
    while(!q.isEmpty()){
    Double sum=0.0;
    int n=q.size();
    int noOfEle=n;
    while(n-->0){
    Treenode head=q.poll();
    sum+=root.val;
    if(root.right!=null){
    q.offer(root.right);
    }
    if(root.left!=null){
    q.offer(root.left);
    }
    }
    l.add(new Double(sum/noOfEle));
    }
    return l;
    }
    }
    
