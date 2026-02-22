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
    public void reorderList(ListNode head) {
        ListNode node = head;
        ListNode slow = head;
        ListNode fast = head.next;
        while(fast != null && fast.next != null){
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode secondHead = reverseList(slow.next);
        slow.next = null;
        ListNode temp1 = head;
        ListNode temp2 = secondHead;
        ListNode next1 = temp1;
        ListNode next2 = temp2;
        while(temp1 != null && temp2 != null){
            next1 = temp1.next;
            temp1.next = temp2;
            temp1 = next1;
            next2 = temp2.next;
            temp2.next = temp1;
            temp2 = next2;
        }
    }

    private ListNode reverseList(ListNode head){
        if(head == null || head.next == null) return head;
        ListNode node = head;
        ListNode temp = node.next;
        ListNode next = temp;
        node.next = null;
        while(temp != null){
            next  = temp.next;
            temp.next = node;
            node = temp;
            temp = next;
        }
        return node; 
    }
}