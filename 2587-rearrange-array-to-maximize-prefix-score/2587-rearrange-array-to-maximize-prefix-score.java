class Solution {
    public int maxScore(int[] nums) {
        Arrays.sort(nums);
        long sum=0,c=0;
        for(int i=nums.length-1;i>=0;i--){
            sum+=nums[i];
            if(sum>0)   c++;
        }
        return (int)c;
    }
}