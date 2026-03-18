class Solution {
    class Pair{
        int node;
        int cost;
        Pair(int node,int cost){
            this.node=node;
            this.cost=cost;
        }
    }
    public int networkDelayTime(int[][] times, int n, int k) {
        List<List<Pair>> adj = new ArrayList<>();
        for(int i=0;i<=n;i++){
            adj.add(new ArrayList<>());
        }
        for(int e[] : times){
            adj.get(e[0]).add(new Pair(e[1],e[2]));
            // adj.get(e[1]).add(new Pair(e[0],e[2]));
        }
        int arr[] = new int[n+1];
        Arrays.fill(arr,Integer.MAX_VALUE);
        arr[k]=0;
        PriorityQueue<Pair> pq = new PriorityQueue<>((a,b)->
        a.cost-b.cost);
        pq.add(new Pair(k,0));
        Set<Integer> set = new HashSet<>();
        while(!pq.isEmpty()){
            Pair pair = pq.poll();
            int currnode = pair.node;
            int currdis = pair.cost;
            if(set.contains(currnode)){
                continue;
            }
            set.add(currnode);
            for(Pair nei : adj.get(currnode)){
                if(!set.contains(nei.node)){
                    int newdis = nei.cost+currdis;
                    if(newdis < arr[nei.node]){
                        arr[nei.node] = newdis;
                        pq.add(new Pair(nei.node,newdis));
                    }
                }
            }
        }
            Arrays.sort(arr);
            if(arr[n-1]==Integer.MAX_VALUE) return -1;
            return arr[n-1];
    }
}