class Solution {
    public int minimumPushes(String word) {
        int n = word.length();
        int ans=0;
        int a=1;
        for(int i=1;i<=n;i++){
            ans =ans+(1*a);
            if(i%8==0){
                a++;
            }
        }
        return ans;
    }
}