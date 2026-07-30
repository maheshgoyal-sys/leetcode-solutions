class Solution {
    public int deleteAndEarn(int[] nums) {
        if(nums.length==1){
            return nums[0];
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        int max=0;
        for(int i : nums){
            map.put(i,map.getOrDefault(i,0)+1);
            max=Math.max(max,i);
        }
        int arr[] = new int[max+1];
        for(int key : map.keySet()){
            arr[key]=map.get(key)*key;
        }
        int dp[]=new int[arr.length+1];
        dp[0]=arr[0];
        
        if(arr.length>=2){
            dp[1]=Math.max(arr[0],arr[1]);
        }
        for(int i=2;i<arr.length;i++){
            int cost = arr[i];
            int take = cost + dp[i-2];
            int skip=dp[i-1];
            dp[i]=Math.max(take,skip);
        }
        return dp[arr.length-1];
    }
}