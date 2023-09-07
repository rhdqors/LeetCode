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
    ArrayList<Integer> lists = new ArrayList<>();
    
    public int kthSmallest(TreeNode root, int k) {
        repeatForSort(root);
        return lists.get(k-1);
    }
    
    
    public void repeatForSort(TreeNode node) {
        if(node == null) return;
        repeatForSort(node.left);
        data = node.val;
        lists.add(data);
        repeatForSort(node.right);    
    }
}