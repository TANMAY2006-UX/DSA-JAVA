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
    public ListNode reverseKGroup(ListNode head, int k) {
        if(k == 1) return head;
        ListNode node = head;
        ListNode Newhead = new ListNode();
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode prevTail = dummy;
        ListNode temp = head;
        int count = 1;
        while(temp != null){
            if(count == k){
                Newhead = temp.next;
                temp.next = null;
                ListNode reverse = reverseList(node);
                prevTail.next = reverse;
                node.next = Newhead;
                prevTail = node;
                temp = Newhead;
                node = Newhead;
                count = 1;  
            }
            else{
            count++;
            temp = temp.next;
        }
        }
        return dummy.next;
    }

    private ListNode reverseList(ListNode head) {
        if(head == null)
            return null;

        if(head.next == null)
            return head;
        
        ListNode node = head;
        ListNode temp = node.next;
        node.next = null;
        ListNode next = temp;
        while(temp != null){
            next = temp.next;
            temp.next = node;
            node = temp;
            temp = next;
        }
        return node;
    }
}