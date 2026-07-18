class Solution {
    public int findGCD(int[] nums) {
        int min=Integer.MAX_VALUE,max=Integer.MIN_VALUE;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<min)min=nums[i];
            if(nums[i]>max)max=nums[i];
        }
        int ans=Integer.MIN_VALUE;
        for(int i=1;i<=Math.min(min,max);i++){
            if(min%i==0 && max%i==0) ans=Math.max(ans,i);
        }
        return ans;
    }
}