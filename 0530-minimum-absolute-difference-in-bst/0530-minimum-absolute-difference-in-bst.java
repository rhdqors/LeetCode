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
// class Solution {
//     Integer prev = null, min = Integer.MAX_VALUE;

//     public int getMinimumDifference(TreeNode root) {
//         repeat(root);
//         return min;
//     }

//     private void repeat(TreeNode node) {
//         if (node == null) {
//             return;
//         }
//         repeat(node.left);
//         if (prev != null) {
//             min = Math.min(min, node.val - prev);
//         }
//         prev = node.val;
//         repeat(node.right);
//     }
// }


class Solution {
    Integer prev = null, min = Integer.MAX_VALUE;
    
    public int getMinimumDifference(TreeNode root) {
        if(root == null) return min;
        getMinimumDifference(root.left);
        
        if(prev != null) min = Math.min(min, root.val-prev); 
        prev = root.val;        
        
        getMinimumDifference(root.right);
        return min;
    }
}
