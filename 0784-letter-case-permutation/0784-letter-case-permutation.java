class Solution {
    public static void helper(int idx,char arr[],List<String> ans){
        if(idx==arr.length){
            ans.add(new String(arr));
            return;
        }   
        if(Character.isDigit(arr[idx])){
            helper(idx+1,arr,ans);
        }
        else{
            arr[idx] = Character.toLowerCase(arr[idx]);
            helper(idx+1,arr,ans);
            arr[idx] = Character.toUpperCase(arr[idx]);
            helper(idx+1,arr,ans);
        }
    }
    public List<String> letterCasePermutation(String s) {
        List<String> ans = new ArrayList<>();
        helper(0,s.toCharArray(),ans);
        return ans;
    }
}