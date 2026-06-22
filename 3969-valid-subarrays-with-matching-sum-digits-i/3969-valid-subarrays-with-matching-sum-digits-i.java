class Solution {
   public static boolean helper(long sum, int x) {
    long lastDigit = sum % 10;

    while (sum >= 10) {
        sum /= 10;
    }

    long firstDigit = sum;

    return firstDigit == x && lastDigit == x;
}
    public int countValidSubarrays(int[] nums, int x) {
        int ans=0;
        for(int i=0;i<nums.length;i++){
            long sum=0;
            for(int j=i;j<nums.length;j++){
                sum+=nums[j];
                if(helper(sum,x)){
                    ans++;
                }
            }
        }
        return ans;
    }
}