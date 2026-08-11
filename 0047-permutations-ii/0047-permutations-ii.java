class Solution {
    public static void swap(int nums[],int idx,int i){
        while(idx<i){
            int temp=nums[idx];
            nums[idx]=nums[i];
            nums[i]=temp;
            idx++;
            i--;
        }

    }
    public static void helper(int[] nums,List<List<Integer>> list,int idx){
        if(idx==nums.length){
        List<Integer> list1 = Arrays.stream(nums)
                            .boxed()
                            .collect(Collectors.toList());
            if(!list.contains(list1)){
                list.add(new ArrayList<>(list1));
                return;
            }
            return;
        }
        for(int i=idx;i<nums.length;i++){
            swap(nums,idx,i);
            helper(nums,list,idx+1);
            swap(nums,idx,i);
        }
        

    }
    public List<List<Integer>> permuteUnique(int[] nums) {
        List<List<Integer>> list = new ArrayList<>();
        helper(nums,list,0);
        return list;
    }
}