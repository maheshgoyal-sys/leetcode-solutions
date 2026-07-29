class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int a=0;
        int c=0;
        for(int i=1;i<salary.length-1;i++){
            c++;
            a+=salary[i];
        }
        return (double)a/c;
    }
}