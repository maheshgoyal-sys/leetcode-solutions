class Solution {
    public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int s1 =0,s2=0;
    
        if(start>destination){

        for(int i=destination;i<start;i++){
            s1+=distance[i];

        }
        
        }
        else{
        for(int i=start;i<destination;i++){
            s1+=distance[i];
        }

        }
        for(int i : distance){
            s2+=i;
        }
        return Math.min(s1,s2-s1);
    }
}