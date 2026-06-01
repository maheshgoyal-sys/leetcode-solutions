class Solution {
    public int minimumSum(int n, int k) {
        int sum=0;
        Map<Integer,Integer> nm=new HashMap<>();
        for(int i=1;nm.size()<n;i++)
        {
            if(!nm.containsKey(k-i))
            {
                sum+=i;
                nm.put(i,1);
            }
            //System.out.println(nm);
        }
        return sum;
    }
}