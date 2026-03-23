class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tg = 0;
        int tc = 0;
        for(int i : gas){
            tg+=i;
        }
        for(int i : cost){
            tc+=i;
        }
        if(tg<tc){
            return -1;
        }
        int ans =0,cg=0;
        for(int i=0;i<gas.length;i++){
            cg+=gas[i]-cost[i];
            if(cg<0)    {
                ans=i+1;
                cg=0;
            }
        }
        return ans;
    }
}     