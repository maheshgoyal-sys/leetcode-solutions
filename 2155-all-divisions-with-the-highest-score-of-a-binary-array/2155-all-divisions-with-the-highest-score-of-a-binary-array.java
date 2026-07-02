class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        // List<Integer> ans = new ArrayList<>();
        // for(int i=0;i<=nums.length;i++){
        //     int temp=i;
        //     int zero=0;
        //     for(int j=0;j<temp;j++){
        //         if(nums[j]==0){
        //             zero++;
        //         }
        //     }
        //     int one=0;
        //     for(int j=temp;j<nums.length;j++){
        //         if(nums[j]==1){
        //             one++;
        //         }
        //     } 
        //     ans.add(zero+one); 
        // }
        // int max=0;
        // List<Integer> list = new ArrayList<>();
        // for(int i : ans){
        //     if(i>max){
        //         max=i;
        //     }
        // }
        // for(int i=0;i<ans.size();i++){
        //     if(ans.get(i)==max) list.add(i);
        // }
        // return list;
        int n = nums.length;
        int zero[] = new int[n+1];
        int one[] = new int[n+1];
        zero[0]=0;
        for(int i=1;i<=n;i++){
            zero[i]=zero[i-1];
            if(nums[i-1]==0){
                zero[i]++;
            }
        }
        for(int i=n-1;i>=0;i--){
            one[i]=one[i+1];
            if(nums[i]==1){
                one[i]++;
            }
        }
        List<Integer> ans = new ArrayList<>();
        int max=-1;
        for(int i=0;i<=n;i++){
            int s = zero[i]+one[i];
            if(s>max){
                max=s;
                ans.clear();
                ans.add(i);
            }
            else if(s==max){
                ans.add(i);
            }
        }
        return ans;
    }
}