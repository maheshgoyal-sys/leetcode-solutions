class Solution {
    public String convertDateToBinary(String date) {
        String ans = "";
        String s = "";

        for(char ch : date.toCharArray()){
            if(ch != '-'){
                s += ch;
            } else {
                ans += Integer.toBinaryString(Integer.parseInt(s));
                ans += "-";
                s = ""; // reset
            }
        }

        // last part add karo
        ans += Integer.toBinaryString(Integer.parseInt(s));

        return ans;
    }
}