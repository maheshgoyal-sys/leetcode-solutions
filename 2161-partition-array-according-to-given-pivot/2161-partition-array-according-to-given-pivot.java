class Solution {
    public int[] pivotArray(int[] nums, int pivot) {
        
        ArrayList<Integer> num1 = new ArrayList<>();
        ArrayList<Integer> num2 = new ArrayList<>();
        ArrayList<Integer> num3 = new ArrayList<>();
        for(int i=0;i<nums.length;i++){
            if(nums[i]<pivot) num1.add(nums[i]);
            else if(nums[i]>pivot)  num2.add(nums[i]);
            else num3.add(nums[i]);
        } 
        num1.addAll(num3);
        num1.addAll(num2);

        int[] result = new int[num1.size()];
        for (int i = 0; i < num1.size(); i++) {
            result[i] = num1.get(i);
        }

        return result;
    }
}