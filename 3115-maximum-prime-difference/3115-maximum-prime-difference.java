class Solution {
    static boolean vis[];
    public static void helper(){
        Arrays.fill(vis,true);
        vis[0]=false;
        vis[1]=false;
        for(int i=2;i*i<vis.length;i++){
            if(vis[i]){
                for(int j=i*i;j<vis.length;j+=i){
                    vis[j]=false;
                }
            }
        }
    }
    public int maximumPrimeDifference(int[] nums) {
        int n=0;
        for(int i: nums){
            n=Math.max(n,i);
        }
        vis = new boolean[n+1];
        helper();
        int j=0;
        boolean flag = false;
        int ans=0;
        for(int i=0;i<nums.length;i++){
            if(vis[nums[i]] && !flag){
                j=i;
                flag = true;
            }
            else if(vis[nums[i]]){
                ans=Math.max(Math.abs(i-j),ans);
            }
        }
        return ans;
    }
}