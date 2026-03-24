class Solution {
    public static int helper(int idx,int nums[],int n,int sum,int dp[]){
        if(idx==n){
            return 0;
        }

        if(idx>n)   return 0;
        if(dp[idx]!=-1) return dp[idx];
        int take = nums[idx] + helper(idx+2,nums,n,sum,dp);
        int skip = helper(idx+1,nums,n,sum,dp);
        return dp[idx]=Math.max(take,skip);
       

    }
    public int rob(int[] nums) {
        int dp[] = new int[nums.length+1];
        Arrays.fill(dp,-1);
       helper(0,nums,nums.length,0,dp);
        return dp[0];

    }
}