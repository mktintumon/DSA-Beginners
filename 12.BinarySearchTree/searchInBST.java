
      //  LEETCODE - 700

class Solution {
    public class TreeNode {
        int val;
        TreeNode left;
        TreeNode right;
        TreeNode() {}
        TreeNode(int val) { this.val = val; }
        TreeNode(int val, TreeNode left, TreeNode right) {
            this.val = val;
            this.left = left;
            this.right = right;
        }
    }

    public TreeNode searchBST(TreeNode root, int val) {
        if(root == null){
            return null;
        }
        
        if(val == root.val){
            return root;
        }
        else if(val < root.val){
            return searchBST(root.left , val);
        }
        else{
            return searchBST(root.right , val);
        }
        
       
    }
}

