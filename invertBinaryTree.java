/* INVERT A BINARY TREE */

//CODE//
/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode(int x) { val = x; }
 * }
 */
public class Solution {
    public TreeNode invertTree(TreeNode root) {
        TreeNode temp;
        if(root != null)
        {
        invertTree(root.left);
        invertTree(root.right);
        temp =root.left;
        root.left = root.right;
        root.right = temp;
        }
      
      return root;  
    }
}