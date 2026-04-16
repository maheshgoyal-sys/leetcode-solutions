class Solution {
    public List<Integer> solveQueries(int[] nums, int[] queries) {
        int n = nums.length;
        Map<Integer,List<Integer>> map = new HashMap<>();
        int res[] = new int[n]; 
        for(int i=0;i<nums.length;i++){
           map.putIfAbsent(nums[i],new ArrayList<>());
           map.get(nums[i]).add(i);
        }
        Arrays.fill(res,-1);
        for(List<Integer> val : map.values()){
            int size = val.size();
            if(size==1) continue;
            List<Integer> list = new ArrayList<>(val);
            for(int x : val){
                list.add(x+n);
            }
            for(int i=0;i<size;i++){
                int curr = list.get(i);
                int next = list.get(i+1);
                int prev = list.get(i+size-1);
                int d1 = next-curr;
                int d2 = curr-prev;
                if(d2<0)    d2+=n;
                res[curr%n] = Math.min(d1,d2);
            }
        }
        List<Integer> ans = new ArrayList<>();
       
        for(int i=0;i<queries.length;i++){
            ans.add(res[queries[i]]);
        }
        return ans;
    }
}