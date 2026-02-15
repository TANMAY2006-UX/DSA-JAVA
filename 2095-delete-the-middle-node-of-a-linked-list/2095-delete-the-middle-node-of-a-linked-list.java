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
    public ListNode deleteMiddle(ListNode head) {
        if(head == null) return null;
        if(head.next == null){
            head = head.next;
            return head;
        }
        ListNode node = head;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            temp = temp.next;
            len ++;
        }

        for(int i = 0; i < len/2-1 ; i++){
            node = node.next;
        }
        if(node.next != null && node.next.next != null)
            node.next = node.next.next;
        else
            node.next = null;
        return head;
    }
}