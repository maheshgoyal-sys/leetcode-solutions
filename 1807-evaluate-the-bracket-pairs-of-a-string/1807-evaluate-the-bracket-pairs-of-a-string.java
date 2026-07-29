class Solution {
    public String evaluate(String s, List<List<String>> knowledge) {
        HashMap<String,String> map = new HashMap<>();
        for(List<String> str : knowledge){
            String key = str.get(0);
            String value = str.get(1);
            map.put(key,value);
        }
        String temp = "";
        String ans="";
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                temp="";
                i++;
                while(s.charAt(i)!=')'){
                temp+=s.charAt(i++);
                }
                if(map.containsKey(temp)){
                ans+=map.get(temp);
            }
            else{
                ans+="?";
            }
            }
            else{
                ans+=s.charAt(i);
            }
            
            
        }
        return ans;
    }
}