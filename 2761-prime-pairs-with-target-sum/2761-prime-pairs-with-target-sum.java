class Solution {
    public List<List<Integer>> findPrimePairs(int n) {
        boolean prime[] = new boolean[n+1];
        Arrays.fill(prime,true);
        prime[0] = false;
        prime[1] = false;
        List<List<Integer>> list1 = new ArrayList<>();
        for (int p = 2;p*p<=n;p++) {
            if (prime[p]){
                for (int i = p * p; i <= n; i += p) {
                    prime[i] = false;
                }
            }
        }
        for(int i=2;i<=n/2;i++){
        List<Integer> list = new ArrayList<>();
            if(prime[i] && prime[n-i] && (i + (n- i))==n){
                list.add(i);
                list.add(n-i);
                list1.add(list);
            }
        }
        return list1;
    }
}