class Solution {
    public String smallestPalindrome(String s) {
        int freq[] = new int[26];
        for(char ch : s.toCharArray()){
            freq[ch- 'a']++;
        }
        
        String s1="";
        StringBuilder s2 = new StringBuilder();
        char mid='0';
        for(int i=0;i<26;i++){
            if(freq[i]%2==0){
                int times= freq[i]/2;
                while(times-- > 0){
                s1+=(char)(i+'a');
                }
                times= freq[i]/2;
            while(times-- > 0){
                s2.insert(0,(char)(i+'a'));
                }
            }
            else{
                int times= freq[i]/2;
                while(times-- > 0){
                s1+=(char)(i+'a');
                }
                mid = (char)(i+'a');
                times= freq[i]/2;
            while(times-- > 0){
                s2.insert(0,(char)(i+'a'));
                }
            }
        }
    s2.toString();
        if(mid!='0')    return s1+mid+s2;
        return s1+s2;
    }
}