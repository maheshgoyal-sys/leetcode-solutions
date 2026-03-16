class Solution {
    public int[] findOrder(int numCourses, int[][] edges) {
        List<List<Integer>> adj = new ArrayList<>();
        for(int i=0;i<numCourses;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            adj.get(e[1]).add(e[0]);
        }
        List<Integer> list = new ArrayList<>();
        int inde[] = new int[numCourses];
        for(int i=0;i<edges.length;i++){
            int a = edges[i][0];
            inde[a]++;
        }
        Queue<Integer> q = new LinkedList<>();
        for(int i=0;i<numCourses;i++){
            if(inde[i]==0){
                q.add(i);
            }
        }
        int i=0;
        int ans[] = new int[numCourses];
        int c=0;
        while(!q.isEmpty()){
            int rv = q.poll();
            ans[i++] = rv;
            c++;
            for(int nei : adj.get(rv)){
                inde[nei]--;
                if(inde[nei]==0){
                    q.add(nei);
                }
            }
        }
        int arr[] = new int[0];
        if(c==numCourses)
        return ans;
        else return arr;
    }
}