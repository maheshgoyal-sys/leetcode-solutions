class Solution {
    public int returnToBoundaryCount(int[] nums) {
        int c=0;
        int s=0;
        for(int i : nums){
            s+=i;
            if(s==0)    c++;
        }
        return c;
    }
}