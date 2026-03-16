class Solution {
    public static void helper(List<Integer> list,List<List<Integer>> list1,int[][] graph,int target,int source){
        list.add(source);
        if(source==target){
            list1.add(new ArrayList<>(list));
            list.remove(list.size()-1); 
            return;
        }
        for(int nei : graph[source]){
            helper(list,list1,graph,target,nei);

        }
        list.remove(list.size()-1);
    }
    public List<List<Integer>> allPathsSourceTarget(int[][] graph) {
        List<Integer> list = new ArrayList<>();
        List<List<Integer>> list1 = new ArrayList<>();
        helper(list,list1,graph,graph.length-1,0);
        return list1;
    }
}