class Solution {
    public int findJudge(int n, int[][] trust) {
        int inde[] = new int[n+1];
        int outd[] = new int[n+1];
        for(int i=0;i<trust.length;i++){
            int a = trust[i][0];
            int b = trust[i][1];
            outd[a]++;
            inde[b]++;
        }
        for(int i=1;i<=n;i++){
            if(outd[i]==0 && inde[i]==n-1){
                return i;
            }
        }
        return -1;
    }
}