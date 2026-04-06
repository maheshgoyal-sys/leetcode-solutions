class Solution {
    public int wateringPlants(int[] plants, int capacity) {
        int temp=capacity;
        int steps=0;
        for(int i=0;i<plants.length;i++){
           if(capacity<plants[i]){
               steps+=2*i;
               capacity=temp;
            }
            steps++;
            capacity-=plants[i];
        }
        return steps;
    }
}