class Solution {
    public boolean checkIfCanBreak(String s1, String s2) {
        // abc
        // axy
        // abe
        // acd
        // syz
        // cdi
        // yopumzgd  dgmoupyz
        // pamntyya  aamnotyy'
        char arr1[] = s1.toCharArray();
        char arr2[] = s2.toCharArray();
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0;
        boolean f = true;
        boolean s=true;
        while(i<arr1.length){
            if((arr1[i]-'a')>(arr2[i]-'a')){
                f=false;
            }
            if(arr2[i]>arr1[i]){
                s=false;
            }
            i++;
        }
        
        return f ||s;
    }
}