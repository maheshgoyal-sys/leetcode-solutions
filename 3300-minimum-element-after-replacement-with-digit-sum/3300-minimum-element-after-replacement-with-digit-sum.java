class Solution {
    public static int helper(int n){
        int s=0;
        while(n>0){
            int rem = n%10;
            s+=rem;
            n=n/10;
        }
        return s;
    }
    public int minElement(int[] nums) {
        List<Integer> list = new ArrayList<>();
        for(int i : nums){
            list.add(helper(i));
        }
        int ans = Integer.MAX_VALUE;
        for(int i : list){
            ans=Math.min(ans,i);
        }
        return ans;
    }
}