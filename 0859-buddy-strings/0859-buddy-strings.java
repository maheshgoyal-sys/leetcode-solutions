class Solution {
    public boolean buddyStrings(String s, String goal) {
        int freq[] = new int[26];
        if(s.length()!=goal.length())   return false;
    
        if(s.equals(goal)){
            for(int i=0;i<s.length();i++){
                char ch = s.charAt(i);
                freq[ch-'a']++;
                if(freq[ch-'a']>1){
                    return true;
                }
            }
            return false;
        }
        int i=0;
        List<Integer> list = new ArrayList<>();
        while(i<s.length()){
            if(s.charAt(i)!=goal.charAt(i)){
                list.add(i);
            }
            i++;
        }
        if(list.size()!=2){
            return false;
        }
        

        int x=list.get(0);
        int y=list.get(1);
        return s.charAt(x)==goal.charAt(y) && s.charAt(y)==goal.charAt(x);
        
    }
}