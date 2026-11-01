class Solution {
    public int minMoves(int[] nums) {
       
        int l=0,r=nums.length-1;
        Arrays.sort(nums);
        int ans=0;
        while(r>l){
            ans+=nums[r]-nums[l];
            r--;
        }
        return ans;
    }
}