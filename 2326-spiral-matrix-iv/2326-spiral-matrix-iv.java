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
    public int[][] spiralMatrix(int m, int n, ListNode head) {
        int ans[][] = new int[m][n];
         for (int i = 0; i < m; i++) {
            Arrays.fill(ans[i], -1);
        }
        int r=0,c=0;
        int dr[] = {0,1,0,-1};
        int dc[] = {1,0,-1,0};
        int dir=0;
        while(head!=null){
            ans[r][c]=head.val;
            head=head.next;
            int nr = r + dr[dir];
            int nc = c + dc[dir];
            if(nr < 0 || nr >=m || nc<0 || nc>=n || ans[nr][nc]!=-1){
                dir = (dir + 1)%4;
            }
            r+=dr[dir];
            c+=dc[dir];
        }
        return ans;
    }
}