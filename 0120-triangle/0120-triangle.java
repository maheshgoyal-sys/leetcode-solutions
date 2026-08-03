class Solution {
    
    public int minimumTotal(List<List<Integer>> triangle) {
        int m=triangle.size();

        int dp[][] = new int[m][m];
        for(int i=0;i<triangle.get(m-1).size();i++){
            dp[m-1][i]=triangle.get(m-1).get(i);
        }
        for(int i=m-2;i>=0;i--){
            for(int j=0;j<triangle.get(i).size();j++){
                dp[i][j]=Math.min(triangle.get(i).get(j)+dp[i+1][j],triangle.get(i).get(j)+dp[i+1][j+1]);
            }
        }
        return dp[0][0];
    }
}