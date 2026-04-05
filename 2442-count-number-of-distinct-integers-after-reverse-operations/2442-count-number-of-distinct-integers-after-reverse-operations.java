class Solution {
    public static void helper(int num,Set<Integer> set){
        int rev=0;
        while(num>0){
            int rem=num%10;
            rev=rev*10+rem;
            num=num/10;
        }
        set.add(rev);
    }
    public int countDistinctIntegers(int[] nums) {
        Set<Integer> set = new HashSet<>();
        for(int i : nums){
            set.add(i);
            helper(i,set);
        }
        return set.size();
    }
}