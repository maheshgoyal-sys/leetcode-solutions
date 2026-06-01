class Solution {
    public int minimumCost(int[] cost) {
        // 6 5 7 9 2 2
        // 2 2 5 6 7 9
        //
        Arrays.sort(cost);
        if(cost.length<=2){
            int s=0;
            for(int i : cost) s+=i;
            return s;
        }
        int s=0,c=0;
        for(int i=cost.length-1;i>=0;i--){
            if(c==2){
                c=0;
                continue;
            }
            c++;
            s+=cost[i];
        }
        return s;
    }
}