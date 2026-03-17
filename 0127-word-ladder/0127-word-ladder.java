class Solution {
    class Pair{
        String word;
        int steps;
        Pair(String word,int steps){
            this.word=word;
            this.steps=steps;
        }
    }
    public int ladderLength(String beginWord, String endWord, List<String> wordList) {
        Set<String> set = new HashSet<>(wordList);
        if(!set.contains(endWord))   return 0;
        Queue<Pair> q = new LinkedList<>();
        q.add(new Pair(beginWord,1));
        while(!q.isEmpty()){
            Pair pair = q.poll();
            String s = pair.word;
            int steps = pair.steps;
            if(s.equals(endWord)) return steps;
            char arr[] = s.toCharArray();
            for(int i=0;i<arr.length;i++){
                char original = arr[i];
                for(char j='a';j<='z';j++){
                    arr[i] = j;
                    String changeString = new String(arr);
                    if(set.contains(changeString)){
                        set.remove(changeString);
                        q.add(new Pair(changeString,steps+1));
                    }
                    
                }
                arr[i]=original;
            }
        }
        return 0;
    }
}