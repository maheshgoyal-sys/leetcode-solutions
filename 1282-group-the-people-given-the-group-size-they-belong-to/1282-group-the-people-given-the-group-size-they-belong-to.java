class Solution {
    public List<List<Integer>> groupThePeople(int[] groupSizes) {
        int n = groupSizes.length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        for(int i=0;i<n;i++){
            if(!map.containsKey(groupSizes[i])){
                map.put(groupSizes[i],new ArrayList<>());
            }
            map.get(groupSizes[i]).add(i);
        }
        List<List<Integer>> ans = new ArrayList<>();
        for(int key : map.keySet()){
            List<Integer> idx = map.get(key);
            int size = idx.size()/key;
            while(size-- > 0){
            List<Integer> list = new ArrayList<>();
            
                 for(int i=0;i<key;i++){
                    list.add(idx.get(0)); // always 0
                    idx.remove(0);        // remove from front
                }
                ans.add(list);
            }
        }
        return ans;
    }
}