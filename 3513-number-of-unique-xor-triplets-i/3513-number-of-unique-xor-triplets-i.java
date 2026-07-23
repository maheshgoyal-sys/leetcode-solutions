class Solution {
    public int uniqueXorTriplets(int[] nums) {
        if(nums.length<=2){
            return nums.length;
        }
        int m=0;
        for(int i : nums){
            m|=i;
        }
        return m+1;
    }
}