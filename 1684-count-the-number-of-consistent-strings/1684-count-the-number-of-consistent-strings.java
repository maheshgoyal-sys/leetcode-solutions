class Solution {
    public int countConsistentStrings(String allowed, String[] words) {
        Set<Character> set = new HashSet<>();
        for(char ch : allowed.toCharArray()){
            set.add(ch);
        }
        int c=0;
        for(int i=0;i<words.length;i++){
            boolean flag = false;
            for(char ch  : words[i].toCharArray()){
                if(!set.contains(ch)){
                    flag=true;
                }
            }
            if(!flag)   c++;
        }
        return c;
    }
}