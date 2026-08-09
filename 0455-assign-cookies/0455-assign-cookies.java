class Solution {
    public int findContentChildren(int[] g, int[] s) {
        Arrays.sort(g);
        Arrays.sort(s);
        int size = s.length;
        int greed = g.length;
        int i=0,j=0;
        int ans=0;
        while(i<greed && j<size){
            if(g[i]<=s[j]){
                // ans=Math.max(ans,s[j]);
                ans++;
                i++;j++;
            }
           
            else {
                j++;
            }
        } 
        return ans;
    }
}