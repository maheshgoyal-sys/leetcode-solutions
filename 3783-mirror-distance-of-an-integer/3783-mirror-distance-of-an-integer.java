class Solution {
    public static int helper(int n){
        int ans=0;
        while(n>0){
            int rem=n%10;
            ans = (ans*10)+rem;
            n/=10;
        }
        return ans;
    }
    public int mirrorDistance(int n) {
        return Math.abs(n - helper(n));
    }
}