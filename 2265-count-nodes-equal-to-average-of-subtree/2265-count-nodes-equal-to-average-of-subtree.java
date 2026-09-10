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
    static int sum=0,c=0;
    public static void helper(TreeNode root){
        if(root==null){
            return;
        }
        c++;
        sum+=root.val;
        helper(root.left);
        helper(root.right);
    }
    public int averageOfSubtree(TreeNode root) {
        Queue<TreeNode> q = new LinkedList<>();
        q.add(root);
        int count=0;
        while(!q.isEmpty()){
            int len=q.size();
            for(int i=0;i<len;i++){
                TreeNode node = q.poll();
                int val = node.val;
                sum=0;
                c=0;
                helper(node);
                int avg = sum/c;
                if(val==avg){
                    count++;
                }
                if(node.left!=null){
                    q.add(node.left);
                }
                if(node.right!=null){
                    q.add(node.right);
                }
            }
        }
        return count;
    }
}