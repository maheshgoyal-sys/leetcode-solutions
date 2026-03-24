class Solution {
    static int dp[];
    public static int helper(int idx,int n){
       if(idx==n){
        return 1;
       }
       if(idx>n){
        return 0;
       }
       if(dp[idx]!=-1){
        return dp[idx];
       }
       return dp[idx]=helper(idx+1,n) + helper(idx+2,n);
    }
    public int climbStairs(int n) {
        dp = new int[n+1];
        Arrays.fill(dp,-1);
        helper(0,n);
        return dp[0];
    }
}