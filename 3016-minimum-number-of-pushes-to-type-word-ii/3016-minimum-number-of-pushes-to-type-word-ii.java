class Solution {
    public int minimumPushes(String word) {
       
       
    int freq[] = new int[26];
    for(char ch : word.toCharArray()){
        freq[ch-'a']++;
    }
    Arrays.sort(freq);
    int times=1,ans=0,used=0;
    for(int i=freq.length-1;i>=0;i--){
        if(freq[i]>0){
        ans = ans + (freq[i]*times);
        used++;
        if(used%8==0){
            times++;
        }
        }
    }
    // a b c d e
    // 1 1 1 1 1
    return ans;
    }
}