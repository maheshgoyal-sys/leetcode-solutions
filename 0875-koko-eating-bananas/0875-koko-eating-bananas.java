class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int max=0;
        for(int i : piles)  max=Math.max(max,i);
        int left=1,right=max;
        int ans=0;
        while(left<=right){
            int mid = left + (right-left)/2;
            long sum=0;
            for(int i=0;i<piles.length;i++){
                sum+=(long)Math.ceil((double)piles[i]/mid);
            }
            if(sum<=h){
                right=mid-1;
                
                ans=mid;
            }
            else {
                left=mid+1;
            }
        }
        return ans;
    }
}