class Solution {
    public String findCommonResponse(List<List<String>> responses) {
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<responses.size();i++){
            List<String> str = responses.get(i);
            Set<String> set = new HashSet(str);
            for(String s : set){
                map.put(s,map.getOrDefault(s,0)+1);
            }
        }
        String ans="";
        int max=0;
        for(String k : map.keySet()){
            if(map.get(k)>max || (map.get(k)==max && k.compareTo(ans)<0)){
                max=map.get(k);
                ans=k;
            }
        }
        return ans;
    }
}