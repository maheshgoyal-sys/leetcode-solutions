class Solution {
    public int minOperations(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
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