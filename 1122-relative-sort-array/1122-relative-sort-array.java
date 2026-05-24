class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
        int len = arr1.length;
        int ans[] = new int[len];
        Map<Integer,Integer> map = new HashMap<>();
        for(int i : arr1){
            map.put(i,map.getOrDefault(i,0)+1);
        }
        int idx=0;
        for(int i : arr2){
            int freq = map.get(i);
                while(freq-->0){
                    ans[idx++] = i;
                }
            map.remove(i);
        }
        List<Integer> remaining = new ArrayList<>();

        for(int key : map.keySet()) {

            int freq = map.get(key);

            while(freq-- > 0) {
                remaining.add(key);
            }
        }

        Collections.sort(remaining);

        for(int num : remaining) {
            ans[idx++] = num;
        }
        return ans;
    }
}