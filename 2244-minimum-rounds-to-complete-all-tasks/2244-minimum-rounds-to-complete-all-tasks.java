class Solution {
    public int minimumRounds(int[] tasks) {
        // 2 2 2 3 3 4 4 4 4 
        // 2-3
        // 3-2
        // 4-4
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : tasks){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int c=0;
        for(int v : map.values()){
            if(v==1)    return -1;
            else if(v%3==0){
                c+=v/3;
            }
            else c+=v/3+1;
        }
    return c;
    }
}