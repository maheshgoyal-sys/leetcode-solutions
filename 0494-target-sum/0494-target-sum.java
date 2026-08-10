class Solution {
    public static int helper(int nums[],int target,int idx){
        if(idx==nums.length){
            if(target==0){
                return 1;
            }
            return 0;
        }
        int add = helper(nums,target+nums[idx],idx+1);
        int sub = helper(nums,target-nums[idx],idx+1);
        return add+sub;
    }
    public int findTargetSumWays(int[] nums, int target) {
        return helper(nums,target,0);
    }
}