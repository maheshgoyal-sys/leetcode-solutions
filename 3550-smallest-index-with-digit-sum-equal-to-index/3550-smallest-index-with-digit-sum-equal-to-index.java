class Solution {
    public static int helper(int num){
        int ans=0;
        while(num>0){
            int rem = num%10;
            ans +=rem;
            num/=10;
        }
        return ans;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(i == helper(nums[i]))
            return i;
        }
        return -1;
    }
}