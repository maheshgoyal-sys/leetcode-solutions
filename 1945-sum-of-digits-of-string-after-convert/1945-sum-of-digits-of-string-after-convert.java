class Solution {
    public int getLucky(String s, int k) {
        // ch if char then ch-'a'
        // ch if digit char then ch-'0'
        StringBuilder sb = new StringBuilder();
        for(char ch : s.toCharArray()){
            sb.append(ch-'a'+1); 
        }
        String curr = sb.toString();
        int ans =0;
        while(k-->0){
            ans=0;
            for(char ch : curr.toCharArray()){
                ans += ch - '0'; 
            }
            curr=String.valueOf(ans);
        }
        return ans;
    }
}