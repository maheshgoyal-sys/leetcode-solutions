class Solution {
    public int firstUniqueFreq(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        Map<Integer,Integer> map2 = new HashMap<>();
        for(int i : map.values()){
            map2.put(i,map2.getOrDefault(i,0)+1);
        }
        for(int i : nums){
            if(map2.get(map.get(i))==1)    return i;
        }
        return -1;
    }
}