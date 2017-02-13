/*PATH SUM II
Given a binary tree and a sum, find all root-to-leaf paths where each path's sum equals the given sum.
*/

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
    
    public List<List<Integer>> pathSum(TreeNode root, int sum) {
       ArrayList<List<Integer>> result = new ArrayList<>();
       ArrayList<Integer> curr = new ArrayList();
       findPath(root,sum,curr,result);
       return result;
      }
      void findPath(TreeNode root, int sum,ArrayList<Integer> curr, ArrayList<List<Integer>> result)
      {
         if(root == null)
         return;
         curr.add(root.val);
         if(root.left == null && root.right == null && sum == root.val)
         {
             result.add(new ArrayList<>(curr));
             curr.remove(curr.size() - 1);
             return;
         }
         else
         {
             findPath(root.left,sum-root.val,curr,result);
             findPath(root.right,sum-root.val,curr,result);
         }
         curr.remove(curr.size()-1);
      }
  
}