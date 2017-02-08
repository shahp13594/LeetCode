/*BINARY TREE LEVEL ORDER TRAVERSAL
Given a binary tree, return the level order traversal of its nodes' values. (ie, from left to right, level by level).*/

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
    public List<List<Integer>> levelOrder(TreeNode root) {
        
        Queue<TreeNode> queue = new LinkedList<>();
        ArrayList<List<Integer>> result = new ArrayList<>();
        
        if(root == null)
        return result;
        queue.add(root);
        while(!queue.isEmpty())
        {
            int level=queue.size();
           
            ArrayList<Integer> a = new ArrayList<>();
            for(int i=0;i<level;i++)
            { 
            root = queue.poll();
             if(root.left!=null)
            queue.add(root.left);
            if(root.right!=null)
            queue.add(root.right);
            a.add(root.val); 
            }
        
            result.add(a);
        }
        return result;
    }
}