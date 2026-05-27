class Solution {
    public int numberOfSpecialChars(String word) {
        Map<Character,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<word.length();i++){
            char ch = word.charAt(i);
            char lower = Character.toLowerCase(ch);
            map.putIfAbsent(lower,new ArrayList<>(Arrays.asList(-1,-1)));
            if(Character.isUpperCase(ch)){
                if(map.get(lower).get(0)==-1){
                    map.get(lower).set(0,i);
                }
            }
            else{
                map.get(lower).set(1,i);
            }
            }
        int count =0;
        for(char key : map.keySet()){
            int lower = map.get(key).get(1);
            int upper = map.get(key).get(0);
            if(upper>lower && lower!=-1) count++;
        }
        return count;
    }
}