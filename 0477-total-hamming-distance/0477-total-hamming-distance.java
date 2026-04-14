class Solution {
    public int totalHammingDistance(int[] nums) {
        int ans=0;
        for(int i=0;i<32;i++){
            int one=0;
            for(int num : nums){
                if(((num >> i)&1)==1){
                    one++;
                }
            }
            int zero = nums.length-one;
            ans+=zero*one;
        }
        return ans;
    }
}