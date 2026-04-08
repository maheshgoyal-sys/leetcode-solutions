class Solution {
    public int minBitFlips(int start, int goal) {
        String s1 = Integer.toBinaryString(start);
        String s2 = Integer.toBinaryString(goal);
        int i=0,c=0;
        int maxlen = Math.max(s1.length(),s2.length());
        while(s1.length() < maxlen) s1="0" +s1;
        while(s2.length() < maxlen) s2="0"+s2;
        while(i<s1.length()){
            if(s1.charAt(i)=='1' && s2.charAt(i)=='1' || s1.charAt(i)=='0' && s2.charAt(i)=='0'){
                
            }
            else{
                c++;
            }
            i++;
        }
        return c;
    }
}