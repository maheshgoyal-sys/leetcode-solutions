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
    public int[] nodesBetweenCriticalPoints(ListNode head) {
        boolean flag[] = new boolean[100000];
        ListNode prev = head,
        curr=null;
        int ans[] = new int[2];
        Arrays.fill(ans,-1);
        if(head.next!=null){

        curr = head.next;
        }
        else{
            return ans;
        }
        int idx=0;
        while(curr.next!=null){
            ListNode next = curr.next;
            if((prev.val<curr.val && curr.val>next.val) || prev.val>curr.val && curr.val<next.val){
                flag[idx]=true;
            }
            idx++;
            prev=curr;
            curr=curr.next;
        }
        int min =Integer.MAX_VALUE,first=-1,last=-1;
        for(int i=0;i<idx;i++){
            if(flag[i]){
                if(first==-1){
                    first=i;
                }
                if(last!=-1){
                    min=Math.min(min,i-last);
                }
                last=i;
            }
        }
        if (first == -1 || first == last) {
            return ans;
        }

        // Maximum distance
        int max = last - first;

        ans[0] = min;
        ans[1] = max;

        return ans;
    }
}