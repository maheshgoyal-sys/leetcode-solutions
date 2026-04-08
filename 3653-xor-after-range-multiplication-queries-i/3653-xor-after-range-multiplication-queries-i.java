class Solution {
    public int xorAfterQueries(int[] nums, int[][] queries) {
        int mod = 1000000007;
        for(int i[] : queries){
           
            int idx = i[0];
            int r = i[1];
            int k = i[2];
            int v = i[3];
            while(idx<=r){
                long temp=nums[idx];
                nums[idx] = (int)((temp * v)%mod);
                idx+=k;
            }

        }
        int ans=0;
        for(int i=0;i<nums.length;i++){
            ans^=nums[i];
        }
        return ans;
    }
}