class Solution {
    public int maximumScore(int a, int b, int c) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        pq.add(a);
        pq.add(b);
        pq.add(c);
        int ans=0;
        int f=0,s=0;
        while(pq.size()>=2){
            ans++;
           
             f = pq.poll();
           
             s = pq.poll();
            f--;
            if(f!=0)
            pq.add(f);
            s--;
            if(s!=0)
            pq.add(s);
            
            
        }
        // a = 2 b = 4 c=6
        // 2 3 5
        // 2 2 4
        // 2 1 3
        // 1 1 2
        // 1 0 1
        // 0 0 0
        return ans;
    }
}