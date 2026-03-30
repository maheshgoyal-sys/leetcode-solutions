class Solution {
    public List<List<Integer>> findMatrix(int[] nums) {
        List<List<Integer>> list1 = new ArrayList<>();
       Map<Integer,Integer> map = new HashMap<>();
       for(int i : nums){
        map.put(i,map.getOrDefault(i,0)+1);
       }
       while(!map.isEmpty()){
    
            List<Integer> list = new ArrayList<>();
            List<Integer> remove = new ArrayList<>();

        for(int key : map.keySet()){
            list.add(key);
            map.put(key,map.get(key)-1);
            if(map.get(key)==0){
                remove.add(key);
            }
        }
        for(int key : remove){
            map.remove(key);
        }
        list1.add(list);
       }
       return list1;
    }
}