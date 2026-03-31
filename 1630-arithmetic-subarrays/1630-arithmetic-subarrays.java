class Solution {
    public static void helper(int nums[],int start,int end,List<Boolean> ans){
        List<Integer> list = new ArrayList<>();
        for(int i = start;i<=end;i++){
            list.add(nums[i]);
        }
        Collections.sort(list);
        int diff = list.get(1)-list.get(0);
        for(int i=1;i<list.size();i++){
            if(list.get(i)-list.get(i-1)!=diff){
                ans.add(false);
                return;
            }
        }
        ans.add(true);
        return;
    }
    public List<Boolean> checkArithmeticSubarrays(int[] nums, int[] l, int[] r) {
        int i=0;
        List<Boolean> ans = new ArrayList<>();
        while(i<l.length){
            int start = l[i];
            int end = r[i];
            helper(nums,start,end,ans);
            i++;
        }
        return ans;
    }
}