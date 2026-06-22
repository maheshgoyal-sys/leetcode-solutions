class Solution {
    public int countSegments(String s) {
        String arr[] = s.split(" ");
        int c=0;
        for(String str : arr){
            if(str.length()!=0){
                c++;
            }
        }
        return c;
    }
}