class Solution {
    public int[] arrayRankTransform(int[] arr) {
        int n = arr.length;
        int ans[] = new int[n];
        int clone[] = arr.clone();
        Arrays.sort(arr);
        Map<Integer,Integer> map = new HashMap<>();
        int c=1;
        for(int i : arr){
            if(!map.containsKey(i)){
                map.put(i,c);
                c++;
            }
        }
        for(int i=0;i<n;i++){
            ans[i]=map.get(clone[i]);
        }
        return ans;
    }
}