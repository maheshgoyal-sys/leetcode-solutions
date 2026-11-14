class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int ans = Integer.MAX_VALUE;
        for(int i=0;i<nums.size();i++){
            int s=0;
            for(int j=i;j<nums.size() && (j-i+1)<=r ;j++){
                s+=nums.get(j);
                if((j-i+1>=l) && (j-i+1)<=r && s>0){
                    ans=Math.min(ans,s);
                }
            }
        }
        return ans==Integer.MAX_VALUE  ?-1 : ans;
    }
}