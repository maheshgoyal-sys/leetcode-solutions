class Solution {
    public int minOperations(int[] nums, int x) {
        
        int t = 0;
        int sum=0;
        for(int i : nums){
            sum+=i;
        }
        t=sum-x;
        if(t<0) return -1;
        if(t==0){
            return nums.length;
        }
        int l=0,r=0,s=0,ans=-1;
        while(r<nums.length){
            s+=nums[r];
            while(s>t){
                s-=nums[l];
                l++;
            }
            if(s==t){
            ans=Math.max(ans,r-l+1);

            }
            r++;
        }
        return ans==-1?-1 :nums.length-ans;
    }
}