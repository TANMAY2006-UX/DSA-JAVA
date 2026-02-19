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
    public ListNode rotateRight(ListNode head, int k) {
        if(head == null || head.next == null) return head;
        if(k==0) return head;
        ListNode node = head;
        ListNode temp = node;
        int flag = 0;
        int count = 1;
        while(temp != null){
            temp = temp.next;
            flag++;
        }
        int rep = k % flag;
        if(rep == 0) return head;
        int val = flag - rep;
        temp = node;
        while(count < val){
            temp = temp.next;
            count++;
        }
        ListNode t = temp.next;
        ListNode free = null;
        ListNode n = t;
        temp.next = null;
        while(t != null){
            free = t;
            t = t.next;
        }
        free.next = node;
        node = n;
        return node;
    }
}