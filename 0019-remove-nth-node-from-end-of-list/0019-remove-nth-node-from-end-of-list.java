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
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode curr=head;
        int c=0;
        while(curr!=null){
            curr=curr.next;
            c++;
        }
        if (n==c) {
            return head.next;
        }
        curr=head;
        int p=0;
        while(curr!=null){
            if(p==c-n-1){
                curr.next=curr.next.next;
                break;
            }
            curr=curr.next;
            p++;
        }
        return head;
    }
}