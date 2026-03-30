class Solution {
    public int[] diStringMatch(String s) {
        int arr[] = new int[s.length()+1];
        int inc = 0;
        int dec = s.length();
        int idx=0;
        for(char ch : s.toCharArray()){
            if(ch=='I'){
                arr[idx] = inc;
                inc++;
            }
            else{
                arr[idx]= dec;
                dec--;
            }
            idx++;
        }
        if(s.charAt(s.length()-1)=='I'){
            arr[idx++] = inc;
        }
        else{
            arr[idx++] = dec;
        }
        return arr;
    }
}