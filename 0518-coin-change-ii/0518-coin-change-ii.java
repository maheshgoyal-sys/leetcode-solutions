class Solution {
    
    public int change(int amount, int[] coins) {
        // c=0;
        
        // return c;
        int n = coins.length;
        int dp[][] = new int[n+1][amount+1];

            dp[n][0]=1;
        
        for(int i=n-1;i>=0;i--){
            for(int j=0;j<=amount;j++){
                int take=0;
                if(j-coins[i]>=0){
                    take=dp[i][j-coins[i]];
                }
                int nottake = dp[i+1][j];
                dp[i][j]=take+nottake;
            }
        }
        return dp[0][amount];
    }
}