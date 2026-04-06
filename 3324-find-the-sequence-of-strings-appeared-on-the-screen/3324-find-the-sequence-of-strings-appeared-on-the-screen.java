class Solution {
    public List<String> stringSequence(String target) {
        List<String> list = new ArrayList<>();
        String prefix="";
        for(int i=0;i<target.length();i++){
            String temp=prefix;
            for(char c='a';c<='z';c++){
                temp=prefix+c;
                list.add(temp);
                if(c==target.charAt(i)){
                    prefix=temp;
                    break;
                }
            }
        }
        return list;
    }
}