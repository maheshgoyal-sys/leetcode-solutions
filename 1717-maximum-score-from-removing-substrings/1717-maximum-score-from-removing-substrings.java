class Solution {
    public int maximumGain(String s, int x, int y) {
        boolean ab= false;
        boolean ba =false;
        if(x>y) ab=true;
        else ba=true;
        int max =0;
        Stack<Character> st = new Stack<>();
       for(char ch : s.toCharArray()){
        st.add(ch);
        if(st.size()>=2){
            char first = st.pop();
            char second =st.pop();
            if(ba && second=='b' && first=='a'){
                max+=y;
            }
            else if(ab && second=='a' && first=='b'){
                max+=x;
            }
            else{
                st.push(second);
                st.push(first);
            }
        }
       }
       StringBuilder rem = new StringBuilder();
       while(!st.isEmpty()){
        rem.append(st.pop());
       }
       rem.reverse();
       for(char ch : rem.toString().toCharArray()){
        st.add(ch);
        if(st.size()>=2){
            char first = st.pop();
            char second =st.pop();
            if(ba && second=='a' && first=='b'){
                max+=x;
            }
            else if(ab && second=='b' && first=='a'){
                max+=y;
            }
            else{
                st.push(second);
                st.push(first);
            }
        }
       }
       return max;
    }
}