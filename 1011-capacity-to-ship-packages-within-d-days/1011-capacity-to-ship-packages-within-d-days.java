class Solution {
    public static boolean helper(int arr[],long val,int k){
        int c=1;
        int sum=0;
        for(int i : arr){
            
            if(sum+i>val){
                c++;
                sum=i;
            }
            else{
                sum+=i;
            }
        }
        return c<=k;
    }
    public int shipWithinDays(int[] arr, int k) {
         if(k>arr.length)return -1;
        long low = Integer.MIN_VALUE;
        long s=0;
        for(int i : arr){
            low=Math.max(low,i);
            s+=i;
        }
        long high = s;
        long ans=-1;
        while(low<=high){
            long mid = low+(high-low)/2;
            if(helper(arr,mid,k)){
                ans=mid;
                high=mid-1;
            }
            else{
                low=mid+1;
            }
        }
        return (int)ans;
    }
}