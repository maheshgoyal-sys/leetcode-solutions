class Solution {
    public int closestTarget(String[] words, String target, int startIndex) {

        int min = Integer.MAX_VALUE;
        for(int i=0;i<words.length;i++){
            if(words[i].equals(target)){
                   int diff = Math.abs(i-startIndex);
                   int dis = Math.min(diff,words.length-diff);
                   min=Math.min(min,dis);
                }
               
            }
            
        return min==Integer.MAX_VALUE ? -1: min;
    }
}