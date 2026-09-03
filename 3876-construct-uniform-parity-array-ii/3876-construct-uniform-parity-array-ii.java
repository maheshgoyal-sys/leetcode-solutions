class Solution {
    public boolean uniformArray(int[] nums1) {
        int ce=0,co=0;
        for(int i : nums1){
            if(i%2==0)  ce++;
            else co++;
        }
        if(ce==nums1.length || co==nums1.length)    return true;
        ce=0;co=0;
        boolean odd=false,even=false;
        Arrays.sort(nums1);
        int min=nums1[0];
        if(min%2==0){
            even=true;
            ce++;
        }
        else{
            odd=true;
            co++;
        }
        if(odd){
            for(int i=1;i<nums1.length;i++){
                if(nums1[i]%2!=0)   co++;
                else if((nums1[i]-min)%2!=0) co++;
            }
        }
        else{
            for(int i=1;i<nums1.length;i++){
                if(nums1[i]%2==0) ce++;
                else if((nums1[i]-min)%2==0) ce++;
            }
        }
        if(ce==nums1.length || co==nums1.length)    return true;
        return false;
    }
}