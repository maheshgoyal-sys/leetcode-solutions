class Solution {
    public int gcdOfOddEvenSums(int n) {
        int s=0;
        int st=1;
        for(int i=1;i<=n;i++){
            s+=st;
            st+=2;
        }
        int e=0;
         st=2;
        for(int i=1;i<=n;i++){
            e+=st;
            st+=2;
        }
        
        int ans=0;
        for(int i=1;i<=Math.min(s,e);i++){
            if(s%i==0 && e%i==0){
                ans=Math.max(ans,i);
            }
        }
        return ans;
    }
}