class Solution {
    public int maxSubArray(int[] nums) {
        int max = 0,ans=nums[0];
        for(int i : nums){
            if(max<0){
                max=0;
            }
            max+=i;
            ans=Math.max(ans,max);
        }
        return ans;
    }
}