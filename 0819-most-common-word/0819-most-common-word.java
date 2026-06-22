class Solution {
    public String mostCommonWord(String paragraph, String[] banned) {
        Set<String> set = new HashSet<>();
        for(String s : banned){
            set.add(s.toLowerCase());
        }
        Map<String,Integer> map = new HashMap<>();
        for(int i=0;i<paragraph.length();i++){
            if(Character.isLetter(paragraph.charAt(i))){
                StringBuilder sb = new StringBuilder();
                while(i<paragraph.length() && Character.isLetter(paragraph.charAt(i))){
                    sb.append(paragraph.charAt(i));
                    i++;
                }
                String str = sb.toString().toLowerCase();
                if(!set.contains(str)){
                    map.put(str,map.getOrDefault(str,0)+1);
                }
            }
        }
        String ans = "";
        int max=0;
        for(String s : map.keySet()){
            int f=map.get(s);
            if(f>max){
                max=f;
                ans=s;
            }
        }
        return ans;
    }
}