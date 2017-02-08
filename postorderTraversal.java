/*BINARY TREE POSTORDER TRAVERSAL
Given a binary tree, return the postorder traversal of its nodes' values.*/

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
   
    public List<Integer> postorderTraversal(TreeNode root) {
      ArrayList<Integer> list = new ArrayList<Integer>();
         Stack<TreeNode> S = new Stack<TreeNode>();
          TreeNode node = root;
      if (node == null)
            return list;
        S.push(node);
        TreeNode prev = null;
        while (!S.isEmpty()) 
        {
            TreeNode current = S.peek();
  
            if (prev == null || prev.left == current || 
                                        prev.right == current) 
            {
                if (current.left != null)
                    S.push(current.left);
                else if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.val);
                }
  
               
            } 
            else if (current.left == prev) 
            {
                if (current.right != null)
                    S.push(current.right);
                else
                {
                    S.pop();
                    list.add(current.val);
                } 
               
            }                 
             else if (current.right == prev) 
            {
                S.pop();
                list.add(current.val);
            }
  
            prev = current;
        }
  
        return list;
    }
}