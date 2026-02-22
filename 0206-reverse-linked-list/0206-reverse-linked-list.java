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
    public ListNode reverseList(ListNode head) {
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