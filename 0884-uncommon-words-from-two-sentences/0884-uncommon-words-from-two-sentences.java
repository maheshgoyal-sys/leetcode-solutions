class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        HashMap<String,Integer> map = new HashMap<>();
        String str[] = s1.split(" ");
        for(String i : str){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        String str1[] = s2.split(" ");
        for(String i : str1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        List<String> list = new ArrayList<>();
        for(String k : map.keySet()){
            if(map.get(k)==1){
                list.add(k);
            }
        }
        String arr[] = new String[list.size()];
        for(int i=0;i<list.size();i++){
            arr[i]=list.get(i);
        }
        return arr;
    }
}