class Solution {
    static int ans=0;
    public static int helper1(int num){
        String s = Integer.toString(num);
        int a[] = new int[s.length()];
        for(int i=0;i<a.length;i++){
            a[i] = s.charAt(i) - '0';
        }
        for(int i=1;i<a.length-1;i++){
            if(a[i-1]<a[i] && a[i]>a[i+1]){
                ans++;
            }
            else if(a[i-1]>a[i] && a[i]<a[i+1]){
                ans++;
            }
        }
        return ans;
    }
    public int totalWaviness(int num1, int num2) {
        ans = 0;
        if(num1<0 || num2<0)    return ans;
        for(int i=num1;i<=num2;i++){
            helper1(i);
        }
        return ans;
    }
}