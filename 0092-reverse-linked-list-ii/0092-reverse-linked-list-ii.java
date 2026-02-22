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
    public ListNode reverseBetween(ListNode head, int left, int right) {
        ListNode dummy = new ListNode(-1);
        dummy.next = head;
        ListNode slow = dummy;
        ListNode fast = head;

        int i = 1;
        int j = 1;
        while(i < right){
            fast = fast.next;
            i++;
        }
        ListNode newNode = fast.next;
        fast.next = null;
        while(j < left){
            slow = slow.next;
            j++;
        }
        ListNode node = slow.next;
        ListNode reverse = reverse(node);
        slow.next = fast;
        node.next = newNode;
        return dummy.next;
    }

    private ListNode reverse(ListNode head){
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
        return head;
    }
}