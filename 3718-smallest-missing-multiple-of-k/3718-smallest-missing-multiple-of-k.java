class Solution {
    public int missingMultiple(int[] nums, int k) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i=1;i<=200;i++){
            if(i%k==0 && !set.contains(i))  return i;
        }
        return -1;
    }
}