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
    static int move=0;
    public static int helper(TreeNode root){
        if(root==null)  return 0;
        int left = helper(root.left);
        int right = helper(root.right);
        move+=Math.abs(left)+Math.abs(right);
        int balance = root.val + left + right -1;
        return balance;
    }
    public int distributeCoins(TreeNode root) {
        move=0;
        helper(root);
        return move;
    }
}