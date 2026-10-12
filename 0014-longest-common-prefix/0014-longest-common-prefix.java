class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        String s = strs[0]; 
        String s1 = strs[strs.length-1]; 
        int i=0;
        String ans = "";
        while(i<Math.min(s.length(),s1.length())){
            if(s.charAt(i)==s1.charAt(i)){
                ans+=s.charAt(i);
            }
            else break;
            i++;
        }
        return ans;
    }
}