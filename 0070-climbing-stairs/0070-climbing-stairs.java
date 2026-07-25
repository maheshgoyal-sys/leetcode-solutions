class Solution {
    static int dp[] = new int[45+1];
    public int climbStairs(int n) {
        if(n==1 || n==2) return n;
        if(dp[n]!=0){
            return dp[n];
        }
       dp[n]=climbStairs(n-1) + climbStairs(n-2);     
       return dp[n];
    }
}