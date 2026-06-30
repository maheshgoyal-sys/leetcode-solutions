class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=0;
        for(int i : nums){
            sum+=i;
        }
        int s=0;
        for(int i : nums){
            while(i>0){
                int rem=i%10;
                s+=rem;
                i=i/10;
            }
        }
        return sum-s;
    }
}