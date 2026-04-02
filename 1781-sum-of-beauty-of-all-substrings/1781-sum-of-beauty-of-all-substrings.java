class Solution {
    static int c=0;
    public static void helper(String str){
        int freq[] = new int[26];
        for(int i=0;i<str.length();i++){
            freq[str.charAt(i) -'a']++;
        }
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        for(int i=0;i<26;i++){
            if(freq[i]>0){

             max = Math.max(max,freq[i]);
             min =Math.min(min,freq[i]);
            }
        }
        c+=max-min;
    }
    public int beautySum(String s) {
        c=0;
        for(int i=0;i<s.length();i++){
            for(int j=i;j<s.length();j++){
                helper(s.substring(i,j+1));
            }
        }
        return c;
    }
}