class Solution {
    public int maximumElementAfterDecrementingAndRearranging(int[] arr) {
        Arrays.sort(arr);
        int c=0;
        int min=1;
        // 9 73 98
        // 1
            if(arr[0]!=1){
                arr[0]=1;
    
            }
        for(int i=1;i<arr.length;i++){
           
                arr[i]=Math.min(arr[i],arr[i-1]+1);
                
            
        }
        int max =0;
        for(int i : arr){
            max=Math.max(max,i);
        }
        return max;
    }
}