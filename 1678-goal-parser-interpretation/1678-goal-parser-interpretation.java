class Solution {
    public String interpret(String command) {
        String ans = "";
        for(int i=0;i<command.length();i++){
            if(command.charAt(i)=='G'){
                ans+="G";
            }
            else if(i+1<command.length() && command.charAt(i)=='(' && command.charAt(i+1)=='a'){
                ans+="al";
                i+=3;
            }
            else if(command.charAt(i)=='(') ans+="o";
        }
        return ans;
    }
}