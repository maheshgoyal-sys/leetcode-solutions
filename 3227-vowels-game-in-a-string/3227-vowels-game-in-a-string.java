class Solution {
    public boolean doesAliceWin(String s) {
        // Map<Character,Integer> map = new HashMap<>();
        int c=0;
        for(char ch : s.toCharArray()){
            if(ch=='a' || ch=='e' || ch=='o' || ch=='u' || ch=='i'){
                // map.put(ch,map.getOrDefault(ch,0)+1);
                c++;
            }
        }
        if(c==0)    return false;
        return true;
    }
}