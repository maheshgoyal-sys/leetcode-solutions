class Solution {
    public boolean canJump(int[] nums) {
        int mi=0;
    
        for(int i=0;i<nums.length;i++){
            if(i>mi)    return false;
            mi=Math.max(mi,i+nums[i]);
            
        }
        return true;
    }
}