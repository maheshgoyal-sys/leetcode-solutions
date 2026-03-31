class Solution {
    public boolean closeStrings(String word1, String word2) {
        if(word1.length()!=word2.length())  return false;
        int w1[] = new int[26];
        for(int i=0;i<word1.length();i++){
            w1[word1.charAt(i) - 'a']++;
        }
        List<Integer> l1 = new ArrayList<>();
        for(int i=0;i<w1.length;i++){
            l1.add(w1[i]);
        }
        int w2[] = new int[26];
        for(int i=0;i<word2.length();i++){
            w2[word2.charAt(i) - 'a']++;
        }
        for(int i=0;i<26;i++){
            if((w1[i]==0 && w2[i]!=0) || (w1[i]!=0 && w2[i]==0))    return false;
        }
        for(int i=0;i<w2.length;i++){
            if(l1.contains(w2[i])){
                l1.remove(Integer.valueOf(w2[i]));
            }
            else{
                return false;
            }
        }
        return true;
    }
}