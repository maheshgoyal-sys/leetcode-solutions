/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode mergeNodes(ListNode head) {
        // 0 3 1 0 4 5 2 0
        // 0 1 0 3 0 2 2 0
        ListNode curr = head;
        
        int sum=0;
        List<Integer> list = new ArrayList<>();
        while(curr!=null){
            if(curr.val==0){
                list.add(sum);
                sum=0;
            
            }
            sum+=curr.val;
            
            curr=curr.next;
        }
        // for(int i : list){
        //     System.out.println(i);
        // }
        curr=head;
        for(int i=1;i<list.size();i++){
            curr.val=list.get(i);
            if(i != list.size()-1)
                curr = curr.next;
        }
        curr.next=null;
        return head;
    }
}