class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        int freq[] = new int[1001];
        for(int i : nums1){
            freq[i]++;
        }
        int freq1[] = new int[1001];
        for(int i : nums2){
            freq1[i]++;
        }
        List<Integer> list = new ArrayList<>();
        for(int i=0;i<1001;i++){
            if(freq[i]>0 && freq1[i]>0){
                list.add(i);
            }
        }
        int arr[] = new int[list.size()];
        int idx=0;
        for(int i=0;i<list.size();i++){
            arr[idx++]=list.get(i);
        }
        return arr;
    }
}