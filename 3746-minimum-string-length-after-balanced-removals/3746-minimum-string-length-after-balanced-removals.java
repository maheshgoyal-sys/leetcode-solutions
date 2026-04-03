class Solution {
    public int minLengthAfterRemovals(String s) {
        Map<Character,Integer> map = new HashMap<>();
        for(char ch : s.toCharArray()){
            map.put(ch,map.getOrDefault(ch,0)+1);
        }
        int ca = map.getOrDefault('a',0);
        int cb = map.getOrDefault('b',0);
return Math.abs(ca-cb);
    }
}