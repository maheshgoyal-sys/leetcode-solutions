class Solution {
    public int[] rearrangeBarcodes(int[] barcodes){
        int n=barcodes.length;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : barcodes){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        PriorityQueue<int []> pq = new PriorityQueue<>((a,b) -> b[1]-a[1]);
        for(Map.Entry<Integer,Integer> e : map.entrySet()){
            pq.add(new int[]{e.getKey(),e.getValue()});
        }
       
        int arr[] = new int[n];
        int idx=0;
        while(!pq.isEmpty()){
            int curr[] = pq.poll();
            while(curr[1]>0){
                if(idx>=n){
                    idx=1;
                }
                arr[idx]=curr[0];
                idx+=2;
                curr[1]--;
            }
        }
        return arr;
    }
}