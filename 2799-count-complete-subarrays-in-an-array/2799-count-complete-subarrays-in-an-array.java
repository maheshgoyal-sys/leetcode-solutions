class Solution {
    public int countCompleteSubarrays(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        int k = set.size();
        int c=0;
        for(int i=0;i<nums.length;i++){
            set.clear();
            for(int j=i;j<nums.length;j++){
                set.add(nums[j]);
                if(set.size()==k)   c++;
            }
            // set.clear();
        }
        return c;
    }
}