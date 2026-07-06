class Solution {
    public int maxScore(String s) {
        int n = s.length();
        int left[] = new int[n];
        left[0]=(s.charAt(0)=='0')?1:0;
        for(int i=1;i<n;i++){
            left[i]=left[i-1];
            if(s.charAt(i)=='0'){
                left[i]++;
            }
        }
        int right[] = new int[n];
        right[n-1]=(s.charAt(n-1)=='1')?1:0;
        for(int i=n-2;i>=0;i--){
            right[i]=right[i+1];
            if(s.charAt(i)=='1'){
                right[i]++;
            }
        }
        int ans=0;
        for(int i=0;i<n-1;i++){
            ans=Math.max(ans,left[i]+right[i+1]);
        }
        return ans;
    }
}