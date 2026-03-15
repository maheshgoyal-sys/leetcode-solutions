class Solution {

    public boolean validPath(int n, int[][] edges, int source, int destination) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[]: edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        Queue<Integer> q = new LinkedList<>();
        Set<Integer> set = new HashSet<>();
        q.add(source);
        while(!q.isEmpty()){
            int rv = q.poll();
            if(set.contains(rv)){
                continue;
            }
            if(rv==destination) return true;
            set.add(rv);
            for(int nei : adj.get(rv)){
                if(!set.contains(nei)){
                    q.add(nei);
                }
            }
        }
        return false;
    }
}