class Solution {
    public int maxDepth(String s) {
        
        int ans=0,c=0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                c++;
                ans=Math.max(c,ans);
            }
            else if(ch==')'){
                c--;
            }
        }
        return ans;
    }
}