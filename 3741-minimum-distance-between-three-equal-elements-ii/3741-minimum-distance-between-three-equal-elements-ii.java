class Solution {
    public int minimumDistance(int[] nums) {
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
           map.putIfAbsent(nums[i],new ArrayList<>());
            map.get(nums[i]).add(i);
        }
        int ans=Integer.MAX_VALUE;
        for(List<Integer> list : map.values()){
            int dis = 0;
            if(list.size() < 3) continue;
           for(int i=2;i<list.size();i++){
            dis=Math.abs(list.get(i)-list.get(i-1)) + Math.abs(list.get(i-1) - list.get(i-2)) + Math.abs(list.get(i-2)-list.get(i));

        ans=Math.min(dis,ans);
        }
        }
        return ans==Integer.MAX_VALUE ? -1: ans;
    }
}