class Solution {
    public List<Integer> findSmallestSetOfVertices(int n, List<List<Integer>> edges) {
        int inde[] = new int[n];
        for(List<Integer> e : edges){
            int a = e.get(1);
            inde[a]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<n;i++){
            if(inde[i]==0){
                list.add(i);
            }
        }
        return list;
    }
}