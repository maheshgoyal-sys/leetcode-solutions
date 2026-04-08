class Solution {
    public long maxSum(List<Integer> nums, int m, int k) {
        Map<Integer,Integer> map = new HashMap<>();
        int l=0,r=0;
        long sum=0;
        long max=0;
        while(r<nums.size()){
            sum+=nums.get(r);
            
            map.put(nums.get(r),map.getOrDefault(nums.get(r),0)+1);
            if((r-l+1)>k){
                int left = nums.get(l);
                map.put(left,map.get(left)-1);
                if(map.get(left)==0){
                    map.remove(left);
                }
                sum-=nums.get(l);
                l++;
            }
                if(map.size()>=m){

            max=Math.max(max,sum);
                }
            r++;
        }
        return max;
    }
}