class Solution {
    public int findSpecialInteger(int[] arr) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int n = arr.length/4;
        for(int k : map.keySet()){
            if(map.get(k)>n) return k;
        }
        return 0;
    }
}