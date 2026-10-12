class Solution {
    public boolean checkInclusion(String s1, String s2) {
        int freq[] = new int[26];
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i) - 'a']++;
        }
        int freq1[] = new int[26];
        int l=0,r=0;
        // freq = a b 
        //        1 1
        //     freq1 = e i d b a o o o 
        //               11
        while(r<s2.length()){
            freq1[s2.charAt(r)-'a']++;
             if(Arrays.equals(freq1,freq)){
                return true;
            }
            while((r-l+1)>s1.length()){
                freq1[s2.charAt(l)-'a']--;
                l++;
            }
            if(Arrays.equals(freq1,freq)) return true;
            r++;
        }
        return false;
    }
}