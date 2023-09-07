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
        repeat(root);
        return min;
        
        
    }
    
    public void repeat(TreeNode node) {
        if(node == null) {
            return; 
        }
        repeat(node.left);
        System.out.println("node.val = " + node.val);
        if(prev != null) {
            min = Math.min(min, node.val-prev);
        }
        System.out.println("1 prev = " + prev);
        prev = node.val;
        System.out.println("2 prev = " + prev);
        repeat(node.right);
    }
}

// class Solution {
//     public int getMinimumDifference(TreeNode root) {
//         int min = Integer.MAX_VALUE;
//         TreeNode pre = null;
//         TreeNode cur = root;
//         Stack<TreeNode> stack = new Stack<>();

//         while (cur != null || !stack.isEmpty()) {
//             while (cur != null) {
//                 stack.push(cur);
//                 cur = cur.left;
//             }
//             cur = stack.pop();
//             if (pre != null) {
//                 min = Math.min(min, cur.val - pre.val);
//             }
//             pre = cur;
//             cur = cur.right;
//         }

//         return min;
//     }
// }
