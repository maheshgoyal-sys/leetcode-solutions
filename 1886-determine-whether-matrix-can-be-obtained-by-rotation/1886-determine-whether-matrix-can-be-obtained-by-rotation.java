class Solution {
    public static int[][] newmatrix(int mat[][]){
        int newmat[][] = new int[mat.length][mat[0].length];
        for(int i=0;i<mat.length;i++){
            for(int j=0;j<mat[0].length;j++){
                newmat[j][mat.length-1-i] = mat[i][j];
            }
        }
        return newmat;
    }
    public static boolean check(int newmat[][],int target[][]){
        for(int i=0;i<newmat.length;i++){
            for(int j=0;j<newmat[0].length;j++){
                if(newmat[i][j]!=target[i][j])  return false;
            }
        }
        return true;
    }
    public boolean findRotation(int[][] mat, int[][] target) {
        for(int i=0;i<4;i++){
            mat = newmatrix(mat);

            if(check(mat,target))    return true;
        }
    return false;
    }
}