class Solution {
    public long minimumSteps(String s) {
        long ans=0;
        char arr[] = s.toCharArray();
        long one =0;
        for(char c : arr){
            if(c=='1')  one++;
            else ans+=one;
        } 
        return ans;
    }
}