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
    Integer min = Integer.MAX_VALUE;
    Integer data = null;
    
    public int getMinimumDifference(TreeNode root) {
        repeatForSort(root);
        return min;
    }
    
    public void repeatForSort(TreeNode node) {
        if(node == null) return ;
        repeatForSort(node.left);
        if(data != null) min = Math.min(min, node.val-data);
        data = node.val;
        repeatForSort(node.right);
    }
}