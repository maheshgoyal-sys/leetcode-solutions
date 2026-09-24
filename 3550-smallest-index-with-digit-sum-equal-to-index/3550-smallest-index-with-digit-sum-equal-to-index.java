class Solution {
    public static int helper(int num){
        int s=0;
        while(num>0){
            int rem = num%10;
            s+=rem;
            num=num/10;
        }
        return s;
    }
    public int smallestIndex(int[] nums) {
        for(int i=0;i<nums.length;i++){
            if(helper(nums[i])==i){
                return i;
            }
        }
        return -1;
    }
}