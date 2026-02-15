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
        if(head == null) return head;

        ListNode node = head;
        ListNode temp = head;
        int len = 0;
        while(temp != null){
            len++;
            temp = temp.next;
        }
        if(n > len || n < 0) return head;
        if(len == 1 && n == 1) return null;
        if(len == n){
            head = head.next;
        }
        int rem = len - n;
        int i = 1;
        while(i < rem){
            node = node.next;
            i++;
        }
        if(node.next.next != null){
            node.next = node.next.next;
        }
        else{
            node.next = null;
        }
        return head;
    }
}