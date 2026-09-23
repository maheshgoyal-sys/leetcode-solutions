class Solution {
    public int lengthOfLongestSubstring(String s) {
        int ans = 0,l=0,r=0,n=s.length();
        HashSet<Character> set = new HashSet<>();
        while(r<n){
            while(l<n && set.contains(s.charAt(r))){
                set.remove(s.charAt(l));
                l++;
            }
            set.add(s.charAt(r));
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}