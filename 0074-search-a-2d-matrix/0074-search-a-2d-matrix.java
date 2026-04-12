class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int r = matrix.length;
        int c=matrix[0].length;

        int arr[] = new int[r*c];
        int idx=0;
        for(int i=0;i<matrix.length;i++){
            for(int j=0;j<matrix[0].length;j++){
                    arr[idx++]=matrix[i][j];
            }
        }
        int left = 0,right=arr.length-1;
        while(left<=right){
            int mid = left + (right-left)/2;
            if(arr[mid]==target){
                return true;
            }
            else if(arr[mid]<target){
                left=mid+1;
            }
            else right=mid-1;
        }
        return false;
    }
}