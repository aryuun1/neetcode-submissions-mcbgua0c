/**
 * Definition for a binary tree node.
 * public class root {
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
    public TreeNode invertTree(TreeNode root) {
        if(root == null){
            return null;
        }

        TreeNode inv = new TreeNode();

        inv = root.left;
        root.left = root.right;
        root.right = inv;

        invertTree(root.left);
        invertTree(root.right);

        return root;
    }
}
