class Solution {
    public static StringBuilder helper(String str){
        String a = "";
        for(int i=str.length()-1;i>=0;i--){
            a+=str.charAt(i);
        }
        return new StringBuilder(a);
    }
    public String processStr(String s) {
        StringBuilder sb = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(Character.isLowerCase(ch)){
                sb.append(ch);
            }
            else if(ch=='*'){
                if(sb.length()>0){

                sb.deleteCharAt(sb.length()-1);
                }
            }
            else if(ch=='#'){
                sb.append(sb.toString());
            }
            else{
                sb=helper(sb.toString());
            }

        }
        return sb.toString();
    }
}