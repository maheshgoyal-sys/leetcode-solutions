class Solution {
    public static void helper(StringBuilder ans){
        int l=0,r=ans.length()-1;
        while(l<r){
            char temp = ans.charAt(l);
            ans.setCharAt(l,ans.charAt(r));
            ans.setCharAt(r,temp);
            l++;
            r--;
        }
    }
    public String reverseParentheses(String s) {
        Stack<StringBuilder> st = new Stack<>();
        StringBuilder ans = new StringBuilder();
        for(int i=0;i<s.length();i++){
            char ch = s.charAt(i);
            if(ch=='('){
                
                    st.push(ans);
                
                ans=new StringBuilder();
                
            }
            else if(ch==')'){
                helper(ans);
                if(!st.isEmpty()){
                StringBuilder curr = st.pop();
                curr.append(ans);
                ans=curr;
               
                }
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}