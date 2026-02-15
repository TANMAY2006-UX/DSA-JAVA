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
        ListNode slow = head;
        ListNode fast = head;

        while(fast != null && fast.next != null){
            fast = fast.next.next;
            if(fast != null && fast.next != null){
                slow = slow.next;
            }
        }
        if(slow.next != null && slow.next.next != null){
            slow.next = slow.next.next;
        }
        else
            slow.next = null;
        return head;
    }
}