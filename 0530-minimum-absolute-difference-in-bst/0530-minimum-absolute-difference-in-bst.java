/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    TreeNode head;
    Integer min = Integer.MAX_VALUE;
    Integer data = null;
    
    public int getMinimumDifference(TreeNode root) {
        repeat(root);
        return min;
    }
    
    public void repeat(TreeNode node) {
        if(node == null) return ;
        repeat(node.left);
        if(data != null) min = Math.min(min, node.val-data);
        data = node.val;
        repeat(node.right);
    }
}