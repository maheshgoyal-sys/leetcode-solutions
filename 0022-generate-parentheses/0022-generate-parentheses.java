class Solution {
    public static boolean isValid(String s){
        Stack<Character> st = new Stack<>();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='(' || ch=='{' || ch=='['){
                st.push(ch);
            }
            else{
                if(st.isEmpty()){
                    return false;
                }
                char p = st.pop();
                if((ch=='[' && p!=']') || (ch=='{' && p!='}') || (ch=='(' && p!=')')){
                    return false;
                }
            }
        }
            return st.isEmpty();
    }
    public static void helper(String s,List<String> str,int open,int close,int n){
        if(s.length()==(2*n)){
            if(isValid(s)){
            str.add(s);
            return;
            }
        }
        if(open<n){
            helper(s+'(',str,open+1,close,n);
        }
        if(close<n){
            helper(s+')',str,open,close+1,n);
        }
        
    }
    public List<String> generateParenthesis(int n) {
        List<String> str = new ArrayList<>();
        helper("",str,0,0,n);
        return str;
    }
}