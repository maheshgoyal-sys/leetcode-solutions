class Solution {
    public List<Integer> findMissingElements(int[] nums) {
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        int a = nums[0];
        int b = nums[nums.length-1];
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
        }
        for(int i=a;i<=b;i++){
            if(!set.contains(i))    list.add(i);
        }
        return list;
    }
}