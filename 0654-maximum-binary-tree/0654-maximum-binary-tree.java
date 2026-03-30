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
    public static TreeNode helper(int nums[],int start,int end){
        if(start>end){
            return null;
        }
        int max = nums[start];
        int idx=start;
        for(int i=start;i<=end;i++){
            if(nums[i]>max){
                max=nums[i];
                idx=i;
            }
        }
        TreeNode node = new TreeNode(max);
        node.left = helper(nums,start,idx-1);
        node.right = helper(nums,idx+1,end);
        return node;
    }
    public TreeNode constructMaximumBinaryTree(int[] nums) {
       return helper(nums,0,nums.length-1);
    }
}