class Solution {
    public boolean detectCapitalUse(String word) {
        int uc=0;
        for(char ch : word.toCharArray()){
            if(Character.isUpperCase(ch)){
                uc++;
            }
        }
        if(uc==word.length())   return true;
        if(uc==0)   return true;
        if(uc==1 && Character.isUpperCase(word.charAt(0))) return true;
        return false;
    }
}