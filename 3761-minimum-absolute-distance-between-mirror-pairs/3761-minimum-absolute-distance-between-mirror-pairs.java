class Solution {
    public static int helper(int num){
        int ans = 0;
        while(num>0){
            int rem = num%10;
            ans = (ans*10) + rem;
            num/=10;
        }
        return ans;
    }
    public int minMirrorPairDistance(int[] nums) {
        Map<Integer,Integer> map = new HashMap<>();
        int min =Integer.MAX_VALUE;
        for(int i=0;i<nums.length;i++){
                int rev = helper(nums[i]);
            if(map.containsKey(nums[i])){
                min=Math.min(min,Math.abs(map.get(nums[i])-i));
            }
                map.put(rev,i);
            
        }
        return min == Integer.MAX_VALUE ? -1 : min;
    }
}