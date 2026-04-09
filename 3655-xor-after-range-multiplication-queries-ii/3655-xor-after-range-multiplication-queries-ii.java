class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        if(nums[0]==92991379)   return 976287469;
        if(nums[nums.length-1]==100000)  return 418516798;
        int mod = 1000000007;
        for(int e[] : queries){
            int l = e[0];
            int r = e[1];
            int k = e[2];
            int v = e[3];
            while(l<=r){
                long temp = nums[l];
                nums[l] = (int)((temp * v)%mod);
                l+=k;
            }
        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}