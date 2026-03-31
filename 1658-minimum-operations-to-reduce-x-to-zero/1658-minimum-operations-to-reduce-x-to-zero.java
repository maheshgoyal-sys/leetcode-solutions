class Solution {
    public int minOperations(int[] nums, int x) {
        int sum = 0;
        for(int i : nums){
            sum+=i;
        }
        int target = sum-x;
        int l=0,r=0;
        int s=0;
        int maxlength=-1;
        if(target<0){
            return -1;
        }
        if(target==0)   return nums.length;
        while(r<nums.length){
            s+=nums[r];
            while(s>target){
                s-=nums[l];
                l++;
            }
            if(s==target){

            maxlength=Math.max(maxlength,r-l+1);
            }
            r++;
        }
        int ans = nums.length-maxlength;
        return (maxlength==-1) ? -1 : ans;
    }
}