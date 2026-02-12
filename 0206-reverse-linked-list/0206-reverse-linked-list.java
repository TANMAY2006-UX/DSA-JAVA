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