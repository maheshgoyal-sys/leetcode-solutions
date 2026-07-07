class Solution {
    public int scoreDifference(int[] nums) {
       // 2 4 2 1 2 1
       // 
       int sign=1;
       int ans=0;
       for(int i=0;i<nums.length;i++){
        if(nums[i]%2==1){
            sign*=-1;
        }

        if(i%6==5){
            sign*=-1;
        }
        ans += sign * nums[i];
       }
       return ans;
    }
}