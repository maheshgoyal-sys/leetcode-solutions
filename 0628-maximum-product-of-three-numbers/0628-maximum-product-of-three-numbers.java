class Solution {
    public int maximumProduct(int[] nums) {
        // for(int i=)
        Arrays.sort(nums);
        int c=0;
        int n=nums.length;

        for(int i : nums){
            if(i<0) c++;
        }
        if(c==n){
        int p1=nums[n-1];
        int p2=nums[n-2];
        int p3=nums[n-3];
return p1*p2*p3;
        }
        int p1=nums[n-1];
        int p2=nums[n-2];
        int p3=nums[n-3];
        int n1=0,n2=0;
        if(nums[0]<0){
            n1=nums[0];
        }
        if(nums[1]<0){
            n2=nums[1];
        }
        if(n1!=0 && n2!=0)  return Math.max(n1*n2*p1,p1*p2*p3);
        return p1*p2*p3;
    }
}