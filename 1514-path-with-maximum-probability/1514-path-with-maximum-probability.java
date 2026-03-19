class Solution {
    class Pair{
        int node;
        double cost;
        Pair(int node,double cost){
            this.node=node;
            this.cost=cost;
        }
    }
    public double maxProbability(int n, int[][] edges, double[] succProb, int start_node, int end_node) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<n;i++){
            adj.add(new ArrayList<>());
        }
        int i=0;    
        for(int e[] : edges){
            adj.get(e[0]).add(new Pair(e[1],succProb[i]));
            adj.get(e[1]).add(new Pair(e[0],succProb[i]));
            i++;
        }
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)-> Double.compare(b.cost,a.cost));
        pq.add(new Pair(start_node,1.0));
        Set<Integer> set = new HashSet<>();
        double arr[] = new double[n];
        Arrays.fill(arr,0.0);
        arr[start_node]=1.0;
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int currnode = pair.node;
            double currdis = pair.cost;
            if(currnode==end_node) return arr[currnode];
            if(set.contains(currnode)){
                continue;
            }
            set.add(currnode);
            for(Pair nei : adj.get(currnode)){
                double newdis = nei.cost*currdis;
                if(newdis>arr[nei.node]){
                    arr[nei.node]=newdis;
                    pq.add(new Pair(nei.node,newdis));
                }
            }
        }        
    return 0.0;
    }
}