class Solution {
    public int minMoves2(int[] nums) {
        int l=0,r=nums.length-1;
        Arrays.sort(nums);
        int m=nums[nums.length/2];
        
        long ans=0;
        while(r>=l){
        ans+=Math.abs((long)nums[r]-m);
            // ans+=Math.abs(num-m);
            r--;
        }
        return (int)ans;
    }
}