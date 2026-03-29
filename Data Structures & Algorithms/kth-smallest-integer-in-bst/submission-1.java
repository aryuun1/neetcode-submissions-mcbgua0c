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
    public int kthSmallest(TreeNode root, int k) {
        List<Integer> travis = new ArrayList<>();

        dfs(root, travis);
        return travis.get(k-1);
    }
    public void dfs(TreeNode node, List<Integer> travis){
        if(node == null){
            return;
        }
        dfs(node.left, travis);
        travis.add(node.val);
        dfs(node.right, travis);
    }
}
