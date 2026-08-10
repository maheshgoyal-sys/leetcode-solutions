class Solution {
    public static int helper(int arr){
        String s = Integer.toBinaryString(arr);
        int c=0;
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='1'){
                c++;
            }
        }
        return c;
    }
    public int[] sortByBits(int[] arr) {
        int ans[][] = new int[arr.length][2];
        for(int i=0;i<arr.length;i++){
            int bits = helper(arr[i]);
            int temp[]= new int[2];
            temp[0]=arr[i];
            temp[1]=bits;
            ans[i]=temp;
        }
        Arrays.sort(ans,(a,b)-> a[1]==b[1]?a[0]-b[0]:a[1]-b[1]);
        int nums[] = new int[arr.length];
        for(int i=0;i<arr.length;i++){
            int temp[] = ans[i];
            nums[i]=temp[0];
        }
        return nums;
    }
}