/*DELETE NODE IN BST
Given a root node reference of a BST and a key, delete the node with the given key in the BST. Return the root node reference (possibly updated) of the BST.*/

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
    public TreeNode deleteNode(TreeNode root, int key) {
        if(root == null)
        return root;
        
        if(key < root.val)
        root.left = deleteNode(root.left,key);
        else if(key > root.val)
        root.right = deleteNode(root.right,key);
        else
        {
            if(root.left == null)
            return root.right;
            else if(root.right == null)
            return root.left;
            
            root.val = minvalue(root.right);
            root.right = deleteNode(root.right,root.val);
        }
       return root;   
    }
    
    int minvalue(TreeNode root)
    {
        int minv = root.val;
        while(root.left!=null)
        {
            minv = root.left.val;
            root = root.left;
        }
        return minv;
    }
    
}