class Solution {
    public int maxSubArray(int[] nums) {
        int max = nums[0],s=0;
        for(int i : nums){
            if(s<0) s=0;
            s+=i;
            max=Math.max(max,s);
        }
        return max;
    }
}