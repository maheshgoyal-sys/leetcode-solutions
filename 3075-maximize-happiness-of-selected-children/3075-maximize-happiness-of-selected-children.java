class Solution {
    public long maximumHappinessSum(int[] happiness, int k) {
        int n =happiness.length;
        Arrays.sort(happiness);
        long ans =0;
        int dec=0;
        for(int i=n-1;i>=0 && k>0;i--){
            int val = happiness[i]-dec;
            if(val<=0)  break;

            ans+=val;
            k--;
            dec++;
            
            
        }
        return ans;
    }
}