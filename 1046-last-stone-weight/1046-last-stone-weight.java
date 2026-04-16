class Solution {
    public int lastStoneWeight(int[] stones) {
        PriorityQueue<Integer> pq = new PriorityQueue<>(Collections.reverseOrder());
        for(int i : stones){
            pq.add(i);
        }
        while(pq.size()>1){
            int max = pq.poll();
            int max2  = pq.poll();
            pq.add(max-max2);
        }
        return pq.peek();
    }
}