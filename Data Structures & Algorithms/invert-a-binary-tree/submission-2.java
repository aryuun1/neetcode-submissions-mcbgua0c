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
    public TreeNode inverter(TreeNode root){
        if(root == null){
            return null;
        }
        TreeNode temp = new TreeNode();
        temp = root.right;
        root.right = root.left;
        root.left = temp;

        inverter(root.right);
        inverter(root.left);
        
        return root;
    }
    public TreeNode invertTree(TreeNode root) {
        return inverter(root);
    }
}
