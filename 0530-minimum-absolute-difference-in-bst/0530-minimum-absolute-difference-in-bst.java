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
    Integer prev = null, min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        repeatForSort(root);
        return min;
    }

    private void repeatForSort(TreeNode node) {
        if (node == null) return;
        repeatForSort(node.left);
        
        if (prev != null) min = Math.min(min, node.val - prev);
        prev = node.val;
        
        repeatForSort(node.right);
    }
}