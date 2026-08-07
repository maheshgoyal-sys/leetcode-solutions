class Solution {
    
    public boolean canPartition(int[] nums) {
        int total = 0;
        for(int i : nums){
            total+=i;
        }
        if(total%2!=0)  return false;
        int target=total/2;
        
        boolean dp[][] = new boolean[nums.length+1][target+1];
        for(int i=0;i<=nums.length;i++){
            dp[i][target]=true;
        }
        for(int i=nums.length-1;i>=0;i--){
            for(int sum=target-1;sum>=0;sum--){
                boolean take=false;
                if(sum+nums[i] <= target){

                 take = dp[i+1][sum+nums[i]];
                }
                boolean nottake = dp[i+1][sum];
                dp[i][sum] = take || nottake;
            }
        }
        return dp[0][0];
    }
}