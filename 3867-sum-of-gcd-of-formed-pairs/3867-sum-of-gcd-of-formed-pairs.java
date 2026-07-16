class Solution {
    public static long gcd(int a,int  b){

         while (b != 0) {
            int t = b;
            b = a % b;
            a = t;
        }
        return (long)a;
    }
    public long gcdSum(int[] nums) {
        int n = nums.length;
        int max[] = new int[n];
        max[0]=nums[0];
    
        for(int i=1;i<n;i++){
            max[i] = Math.max(max[i - 1], nums[i]);
        
        }
        long pc[] = new long[n];
        for(int i=0;i<n;i++){
            pc[i]=gcd(nums[i],max[i]);
        }
        Arrays.sort(pc);
        int l=0,r=n-1;
        long ans=0;
        while(l<r){
            ans+=gcd((int)pc[l],(int)pc[r]);
            l++;
            r--;
        }
        return ans;
    }
}