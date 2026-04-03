class Solution {
    public int partitionString(String s) {
        int c=1;
        Set<Character> set = new HashSet<>();
        for(char ch : s.toCharArray()){
            if(!set.contains(ch)){
                set.add(ch);

            }
            else{
                c++;
                set.clear();
                set.add(ch);
            }
        }
        return c;
    }
}