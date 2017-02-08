/*BINARY TREE INORDER TRAVERSAL
Given a binary tree, return the inorder traversal of its nodes' values.*/

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
    public List<Integer> inorderTraversal(TreeNode root) {
        
        ArrayList<Integer> result= new ArrayList<>();
        if(root==null)
        {
            return result;
        }
        
        Stack<TreeNode> st=new Stack<>();
        
        
        
        st.push(root);
        
        while(!st.isEmpty())
        {
            TreeNode temp=st.pop();
            
            if(te!=null)
            {
                st.push(temp);
                temp=temp.left;
            }
            else
            {
               temp =st.pop();
                result.add(temp.val);
                temp=temp.right;
            }
        }
        return result;
        
    }
}