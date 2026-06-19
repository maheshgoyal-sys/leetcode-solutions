class Solution {
    public int largestAltitude(int[] gain) {
        List<Integer> list = new ArrayList<>();
        int s=0;
        list.add(0);
        for(int i=0;i<gain.length;i++){
            s+=gain[i];
            list.add(s);
        }
        Collections.sort(list);
        return list.get(list.size()-1);
    }
}