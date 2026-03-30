class Solution {
    public int numberOfBeams(String[] bank) {
        List<Integer> list  = new ArrayList<>();
        for(int i=0;i<bank.length;i++){
            int c=0;
            String s = bank[i];
            for(int  j= 0;j<s.length();j++){
                if(s.charAt(j)=='1')    c++;
            }
            if(c!=0)
            list.add(c);
        }
        int ans = 0;
        for(int i = 0;i<list.size()-1;i++){
            ans+=list.get(i)*list.get(i+1);
        }
        return ans;
    }
}