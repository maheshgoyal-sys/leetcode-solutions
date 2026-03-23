class Solution {
    public int canCompleteCircuit(int[] gas, int[] cost) {
        int tc=0,tg=0;
        for(int i : cost){
            tc+=i;
        }
        for(int i : gas){
            tg+=i;
        }
        if(tc>tg){
            return -1;
        }
        int s=0,cg=0;
        for(int i =0;i<gas.length;i++){
            cg+=gas[i]-cost[i];
            if(cg<0){
                s=i+1;
                cg=0;
            }
        }
        return s;
    }
}