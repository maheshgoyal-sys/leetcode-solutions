class Solution {
    public int passThePillow(int n, int time) {
        // List<Integer> list = new ArrayList<>();
        // for(int i=1;i<=n;i++){
        //     list.add(i);
        // }
        // for(int i=n-1;i>=;i--){
        //     list.add(i);
        // }
        // int c=1;
        // for(int i : list){
        //     if(c==time+1){
        //         return i;
        //     }
        //     c++;
        // }
        // return 1;
        // 1-2-3-4-5-6-7-8-9-10-11-12-13-14-15-16-17-18
        // 17-16-15-14-13-12-11-10-9-8-7-6-5-4-3-2-1
        // 1-2-3-4-3-2
        // int c=0;
        int i=1;
        int total=1;
        boolean flag = false;
        while(time-->0){
            total++;
            if(i==n){
                flag=false;
            }
            else if(i==1){
                flag=true;
            }
            if(flag){
                i++;
            }
            else if(!flag){
                i--;
            }
        }
        return i;
    }
}