class Solution {
    
    
    public int climbStairs(int n, int[] costs) {
     
        int dp[] = new int[n+1];
        for(int i=n-1;i>=0;i--){
            int a = Integer.MAX_VALUE;
        int b = Integer.MAX_VALUE;
        int c = Integer.MAX_VALUE;
            if(i+1<=n){
                a = costs[i] + (1*1) + dp[i+1];
            }
            if(i+2<=n){
                b = costs[i+1] + (2*2) + dp[i+2];
            }
            if(i+3<=n){
                c = costs[i+2] + (3*3) + dp[i+3];
            }
            dp[i] = Math.min(a,Math.min(b,c));
        }
        return dp[0];
    }
}