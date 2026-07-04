class Solution {
    public int minScore(int n, int[][] roads) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int r[] : roads){
            int u = r[0];
            int v = r[1];
            adj.get(u).add(v);
            adj.get(v).add(u);
        }
        Queue<Integer> q = new LinkedList<>();
        q.add(1);
        Set<Integer> set = new HashSet<>();
        set.add(1);
        List<Integer> list = new ArrayList<>();
        while(!q.isEmpty()){
            int p=q.poll();
            // list.add(p);
            for(int nei : adj.get(p)){
                if(!set.contains(nei)){
                    q.add(nei);
                    set.add(nei);
                }
            }
        }
        int ans=Integer.MAX_VALUE;
        for(int i[] : roads){
            int a = i[2];
            int b=i[0];
            if(set.contains(b))
            ans=Math.min(a,ans);
        }
        return ans;
    }
}