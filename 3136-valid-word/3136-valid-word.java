class Solution {
    public boolean isValid(String word) {
        word=word.toLowerCase();
        int n = word.length();
        if(n<3) return false;
        int vio=0;
        int con=0;
        for(char ch : word.toCharArray()){
            if (!Character.isLetterOrDigit(ch))
    return false;
            if(ch=='a' || ch=='e' || ch=='i' || ch=='o' || ch=='u'){
                vio++;
            }
            else if(Character.isLetter(ch))  con++;
        }
        return vio>0 && con>0;
    }
}