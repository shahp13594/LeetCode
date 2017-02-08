/* CONVERT SORTED ARRAY TO BST 
Given an array where elements are sorted in ascending order, convert it to a height balanced BST.*/

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
    public TreeNode sortedArrayToBST(int[] nums) {
        
        if(nums.length == 0)
         return null;
         
         return sortedArrayToBST(nums,0,nums.length-1);
    }
    
    public TreeNode sortedArrayToBST(int[] nums,int low,int high)
    {
        if(low > high)
        return null;
        int mid = (low + high)/2;
        TreeNode root = new TreeNode(nums[mid]);
        root.left = sortedArrayToBST(nums,low,mid-1);
        root.right = sortedArrayToBST(nums,mid + 1, high);
        return root;
    }
}