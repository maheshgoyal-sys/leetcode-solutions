class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0,r=0,ans=0,temp=k;
        while(r<nums.length){
            while(r<nums.length && (nums[r]==1 || (nums[r]==0 && temp>0))){
                if(nums[r]==0){

                temp--;
                }
                ans=Math.max(ans,r-l+1);
                r++;
            }
           if(temp == 0){
    while(l<nums.length && nums[l] == 1){
        l++;
    }
    l++;
    temp++;
}
        }
        return ans;
    }
}