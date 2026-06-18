class Solution {
    public int maximumLengthSubstring(String s) {
        int max = 0;
        for(int i=0;i<s.length();i++){
        Map<Character,Integer> map = new HashMap<>();
            for(int j=i;j<s.length();j++){
               map.put(s.charAt(j),map.getOrDefault(s.charAt(j),0)+1);
                if(map.get(s.charAt(j))<=2){
                    max=Math.max(max,j-i+1);
                }
                else{
                    break;
                }
                // bcbbbcba
                // b-3
                // c-1
            }
        }   
        return max;
    }
}