/**
 * Definition for a binary tree node.
 * struct TreeNode {
 *     int val;
 *     TreeNode *left;
 *     TreeNode *right;
 *     TreeNode() : val(0), left(nullptr), right(nullptr) {}
 *     TreeNode(int x) : val(x), left(nullptr), right(nullptr) {}
 *     TreeNode(int x, TreeNode *left, TreeNode *right) : val(x), left(left), right(right) {}
 * };
 */


class Solution {
public:
  boolean isSymmetric(Treenode *root,Treenode *subroot){
    if(root==NULL && subroot!=NULL || root!=NULL && subroot==NULL)
      return false;
    if(root==NULL && subroot==NULL)
      return true;
    if(root->val!=subroot->val)
      return false;
    return isSymmetric(root->left,subroot->left) && isSymmetric(root->right,subroot->right);
  }
  boolean isSubtree(Treenode *root,Treenode *subroot){
    if(root==NULL)
      return false;
    if(root->val==subroot->val){
      bool ans=isSymmetric(root,subroot);
      if(ans) return true;
  }
    bool left=isSubtree(root->left,subroot);
    bool right=isSubtree(root->right,subroot);
    return left|| right;
  }
};
    
