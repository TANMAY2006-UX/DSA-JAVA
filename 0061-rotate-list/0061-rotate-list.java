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
        ListNode node = head;
        ListNode temp = node;
        ListNode prev = null;
        int count = 0;
        int flag = 0;
        if(head == null || head.next == null) return head;
        while(temp != null){
            temp = temp.next;
            flag++;
        }
        while(count != k % flag){
            temp = node;
            while(temp.next != null){
                prev = temp;
                temp = temp.next;
            }
            ListNode n = prev.next;
            n.next = node;
            node = n;
            prev.next = null;
            count += 1;
        }
        return node;
    }
}