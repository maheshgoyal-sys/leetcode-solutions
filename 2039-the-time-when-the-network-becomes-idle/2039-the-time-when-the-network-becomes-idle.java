class Solution {
    public int networkBecomesIdle(int[][] edges, int[] patience) {
        Queue<Integer> q = new LinkedList<>();
        q.add(0);
        List<List<Integer>> adj = new ArrayList<>();
        int n = patience.length;
        int time[] = new int[n];
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : edges){
            adj.get(e[0]).add(e[1]);
            adj.get(e[1]).add(e[0]);
        }
        Set<Integer> set = new HashSet<>();
        time[0]=0;
        set.add(0);
        while(!q.isEmpty()){
            int size=q.size();
            for(int i=0;i<size;i++){
                int node = q.poll();
                for(int nei : adj.get(node)){
                    if(!set.contains(nei)){
                        time[nei] = time[node]+1;
                        set.add(nei);
                        q.add(nei);
                    }
                }
            }
        }
        for(int i =0;i<n;i++){
            time[i]=time[i]*2;
        }
        int max = 0;
        for(int i=1;i<n;i++){
            int round=time[i];
            int send = ((round -1)/patience[i])*patience[i];
            int reply = send+round;
            max=Math.max(max,reply);
        }
        return max+1;
    }
}