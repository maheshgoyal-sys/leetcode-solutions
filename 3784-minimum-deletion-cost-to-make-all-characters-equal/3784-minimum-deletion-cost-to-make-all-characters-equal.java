class Solution {
    public long minCost(String s, int[] cost) {
        Map<Character,Long> map = new HashMap<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            long val = cost[i];
            map.put(ch,map.getOrDefault(ch,0L)+val);
        }
        long totalsum = 0;
        for(long i : cost){
            totalsum+=i;
        }
        long ans=Long.MAX_VALUE;
        for(long i : map.values()){
             ans=Math.min(ans,totalsum-i);
        }
        return ans;
    }
}