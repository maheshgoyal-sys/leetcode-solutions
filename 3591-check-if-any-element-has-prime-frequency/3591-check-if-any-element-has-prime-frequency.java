class Solution {
    public static boolean helper(int num){
        int c=0;
        for(int i=1;i<=num;i++){
            if(num%i==0) c++;
        }
        return c==2;
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