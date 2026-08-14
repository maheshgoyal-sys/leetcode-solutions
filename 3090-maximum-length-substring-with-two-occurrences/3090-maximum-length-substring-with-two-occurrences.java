class Solution {
    public int maximumLengthSubstring(String s) {
        Map<Character,Integer> map = new HashMap<>();
        int l=0,r=0,ans=0;
        while(r<s.length()){
            char curr = s.charAt(r);
            map.put(curr,map.getOrDefault(curr,0)+1);
            while(map.get(curr)>2){
                map.put(s.charAt(l),map.get(s.charAt(l))-1);
                if(map.get(s.charAt(l))==0){
                    map.remove(l);
                }
                l++;
            }
            ans=Math.max(ans,r-l+1);
            r++;
        }
        return ans;
    }
}