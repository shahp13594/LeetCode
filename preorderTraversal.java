/*BINARY TREE PREORDER TRAVERSAL
Given a binary tree, return the preorder traversal of its nodes' values.*/

///CODE//
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
    public List<Integer> preorderTraversal(TreeNode root) {
        
        ArrayList<Integer> result=new ArrayList<>();
        Stack<TreeNode> st=new Stack<>();
        if(root == null)
        return result;
        st.push(root);
        while(!st.isEmpty())
        {
            TreeNode temp=st.pop();
            result.add(temp.val);
             if(temp.right!=null)
            st.push(temp.right);
            if(temp.left!=null)
            st.push(temp.left);
           
        }
        return result;
    }
}