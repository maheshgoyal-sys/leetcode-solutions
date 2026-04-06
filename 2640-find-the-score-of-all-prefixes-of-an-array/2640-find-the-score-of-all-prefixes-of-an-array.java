class Solution {
    public long[] findPrefixScore(int[] nums) {
        int n = nums.length;
        long arr[] = new long[n];
        arr[0] = nums[0]*2;
        int max = nums[0];
        for(int i=1;i<n;i++){
             max = Math.max(max, nums[i]);
            arr[i] = nums[i] +arr[i-1]+max;
            // for(int j=0;j<=i;j++){
            //     max=Math.max(max,nums[j]);
            // }
            // max=Math.max(max,nums[i]);
            // arr[i]+=max;
            
        }
        return arr;
    }
}