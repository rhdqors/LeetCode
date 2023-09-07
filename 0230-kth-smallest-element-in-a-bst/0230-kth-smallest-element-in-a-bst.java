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
        repeat(root);
        return lists.get(k-1);
    }
    
    public void repeat(TreeNode node) {
        if(node == null) return;
        repeat(node.left);
        data = node.val;
        lists.add(data);
        // System.out.println("1 data = " + data);
        // System.out.println("1 lists = " + lists);
        repeat(node.right);    
    }
    
}