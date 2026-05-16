class Solution {
    public int findMin(int[] arr) {
        Arrays.sort(arr);
        int left=0,right=arr.length-1;
        while(left<right){
            int mid = left + (right-left)/2;
            if(arr[mid]<arr[left]){
                left=mid-1;
            }
            else{
                right=mid;
            }
        }
        return arr[left];
    }
}