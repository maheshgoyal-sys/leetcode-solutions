class Solution {
    class Pair{
        int node;
        long cost;
        Pair(int node,long cost){
            this.node=node;
            this.cost=cost;
        }
    }

    public int countPaths(int n, int[][] roads) {

        // 🔥 graph banana padega
        List<Pair>[] graph = new ArrayList[n];
        for(int i=0;i<n;i++) graph[i] = new ArrayList<>();

        for(int[] r : roads){
            int u = r[0], v = r[1], w = r[2];
            graph[u].add(new Pair(v,w));
            graph[v].add(new Pair(u,w));
        }

        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b) -> Long.compare(a.cost,b.cost));

        long dist[] = new long[n];   // 🔥 fix size
        Arrays.fill(dist,Long.MAX_VALUE);

        long ways[] = new long[n];   // 🔥 NEW ARRAY

        int MOD = (int)1e9+7;

        dist[0] = 0;
        ways[0] = 1;  // 🔥 start

        pq.add(new Pair(0,0));

        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int currnode = pair.node;
            long currcost = pair.cost;

            for(Pair nei : graph[currnode]){
                long newcost = currcost + nei.cost;

                // ✅ Case 1: better path
                if(newcost < dist[nei.node]){
                    dist[nei.node] = newcost;
                    ways[nei.node] = ways[currnode]; // 🔥 COPY
                    pq.add(new Pair(nei.node,newcost));
                }

                // ✅ Case 2: same shortest path
                else if(newcost == dist[nei.node]){
                    ways[nei.node] = (ways[nei.node] + ways[currnode]) % MOD; // 🔥 ADD
                }
            }
        }

        return (int)(ways[n-1] % MOD); // 🔥 answer
    }
}