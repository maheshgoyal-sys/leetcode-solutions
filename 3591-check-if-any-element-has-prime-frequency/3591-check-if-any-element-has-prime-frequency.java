class Solution {
    public static boolean helper(int num){
        if(num<2) return false;
        for(int i=2;i*i<=num;i++){
            if(num%i==0) return false;
        }
        return true;
    }
    public boolean checkPrimeFrequency(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        for(int v : map.values()){
            if(helper(v)) return true;
        }
        return false;
    }
}