class Solution {
    public int minSteps(String s, String t) {
        int sfre[] = new int[26];
        int tfre[] = new int[26];
        int diff=0;
        for(int i=0;i<s.length();i++){
            sfre[s.charAt(i) -'a']++;
        }
        for(int i=0;i<t.length();i++){
            tfre[t.charAt(i) -'a']++;
        }
        for(int i=0;i<sfre.length;i++){
            if(tfre[i]<sfre[i]){
                diff += sfre[i] - tfre[i];
            }
        }
        return diff;
    }
}