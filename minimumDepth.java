/*MINIMUM DEPTH OF BINARY TREE
Given a binary tree, find its minimum depth.
The minimum depth is the number of nodes along the shortest path from the root node down to the nearest leaf node.*/

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
    public int minDepth(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        if(root == null)
        return 0;
         q.offer(root);
        q.offer(null);
        int count = 1;
        while(!q.isEmpty())
        {
            TreeNode temp = q.poll();
            if(temp!=null)
            {
            if(temp.left == null && temp.right == null)
            return count; 
            if(temp.left!=null) 
             {
              q.offer(temp.left);
             }
             if(temp.right!=null)
              {
              q.offer(temp.right);
              }
            
            }
            else
            {
                
                if(!q.isEmpty())
                {
                count ++;
                 q.offer(null);
                }
            }
        }
        return count;
        
    }
}