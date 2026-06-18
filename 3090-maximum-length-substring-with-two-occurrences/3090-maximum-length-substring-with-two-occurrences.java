class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        int i=0,j=0;
        Map<Character,Integer> map = new HashMap<>();
        while(j<s.length()){
            // bcbbbcba
            // b-2
            // c-1
            char ch = s.charAt(j);
            map.put(ch,map.getOrDefault(ch,0)+1);
            while(map.get(ch)>2){
                char c = s.charAt(i);
                map.put(c,map.get(c)-1);
                if(map.get(c)==0){
                    map.remove(c);
                }
                i++;
                
            
            }
                max=Math.max(max,j-i+1);
                j++;
        }   
        return max;
    }
}