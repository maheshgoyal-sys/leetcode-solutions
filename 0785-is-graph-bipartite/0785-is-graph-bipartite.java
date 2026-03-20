class Solution {
    public boolean isBipartite(int[][] graph) {
        Queue<Integer> q = new LinkedList<>();
        int color[] = new int[graph.length];
        Arrays.fill(color,-1);
        boolean vis[] = new boolean[graph.length];
        for(int j=0;j<graph.length;j++){

        q.add(j);
        while(!q.isEmpty()){
            int size = q.size();
            for(int i=0;i<size;i++){
                int node = q.poll();
                for(int nei : graph[node]){
                    if(color[nei]==-1){
                        color[nei] = 1 - color[node]; 
                        q.add(nei);
                    }
                    if(color[nei]==color[node]){
                            return false;
                    }
                }
            }
        }
        }
        return true;
    }
}