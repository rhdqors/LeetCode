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
    Integer data = null;
    int count = 0;
    
    public int kthSmallest(TreeNode root, int k) {
        repeatForSort(root, k);
        return data;
    }
    
    
    public void repeatForSort(TreeNode node, int i) {
        if(node == null) return;
        repeatForSort(node.left, i);
        count++;
        if(i == count) {
            data = node.val;
            return;
        }
        
        repeatForSort(node.right, i);    
    }
}