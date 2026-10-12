class Solution {
    public int missingNumber(int[] nums) {
        int s=0;
        for(int i: nums){
            s+=i;
        }
        int n = nums.length;
        int total = n*(n+1)/2;
        return total-s;
    }
}