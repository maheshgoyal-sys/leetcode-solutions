class Solution {
    public String shortestBeautifulSubstring(String s, int k) {
        int l=0,r=0;
        int count=0;
        String ans="";
        int min=Integer.MAX_VALUE;
        while(r<s.length()){
            char ch = s.charAt(r);
            if(ch=='1'){
                count++;
            }
            while(count>k){
                if(s.charAt(l)=='1'){
                    count--;
                }
                l++;
            }
            if(count==k){
                while(s.charAt(l)=='0'){
                    l++;
                }
                int len = r-l+1;
                String curr = s.substring(l,r+1);
                if(len<min || (min ==len && curr.compareTo(ans)<0)){
                    min=len;
                    ans=curr;
                }
            }
            r++;
        }
        return ans;
    }
}