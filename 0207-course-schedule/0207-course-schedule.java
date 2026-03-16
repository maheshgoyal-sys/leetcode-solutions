class Solution {
    public boolean canFinish(int numCourses, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            adj.get(e[0]).add(e[1]);
        }
        int inde[] = new int[numCourses];
        for(int i=0;i<edges.length;i++){
            int a = edges[i][1];
            inde[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inde[i]==0){
                q.add(i);
            }
        }
        int c=0;
        while(!q.isEmpty()){
            int rv = q.poll();
            c++;
            for(int nei : adj.get(rv)){
                inde[nei]--;
                if(inde[nei]==0){
                    q.add(nei);
                }
            }
        }
        return c==numCourses;
    }
}