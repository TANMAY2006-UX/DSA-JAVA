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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode temp = l1;
        ListNode temp1 = l2;
        ListNode Head = new ListNode();
        ListNode temp2 = Head;
        int carry = 0;
        while(temp != null && temp1 != null){
            int n1 = temp.val;
            int n2 = temp1.val;
            if(temp.next == null){
                ListNode t = new ListNode(0);
                temp.next = t;
            }
            else if(temp1.next == null){
                ListNode t = new ListNode(0);
                temp1.next = t;
            }
            int sum = carry + n1 + n2;
            carry = 0;
            if(sum >= 10){
                carry = sum / 10;
                sum = sum % 10; 
            }
            ListNode node = new ListNode (sum);
            temp2.next = node;
            temp2 = node;
            temp = temp.next;
            temp1 = temp1.next;
        }
        if(carry!=0){
            while(carry >= 10){
                ListNode n = new ListNode(carry%10);
                carry = carry / 10;
            }
            ListNode n1 = new ListNode(carry);
            temp2.next = n1;
            temp2 = n1;
        }
        return Head.next;
    }
}