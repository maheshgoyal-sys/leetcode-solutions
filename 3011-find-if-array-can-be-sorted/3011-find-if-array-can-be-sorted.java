class Solution {
    public static long helper(long n){
        long c=0;
        while(n>0){
            if(n%2==1)  c++;
            n/=2;
        }
        return c;
    }
    public boolean canSortArray(int[] nums) {
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums.length-1;j++){
                if(helper(nums[j])==helper(nums[j+1]) && nums[j]>nums[j+1]){
                    int temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }
        }
        for(int i=1;i<nums.length;i++){
            if(nums[i-1]>nums[i])   return false;
        }
        return true;
    }
}