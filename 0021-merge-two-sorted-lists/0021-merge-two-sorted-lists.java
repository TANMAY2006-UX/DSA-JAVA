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
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummy = new ListNode(-1);
        ListNode node = dummy;
        ListNode temp1 = list1;
        ListNode temp2 = list2;
        
        while(temp1 != null && temp2 != null){
            ListNode t = new ListNode();
            node.next = t;
            node = t;
            if(temp1.val < temp2.val){
            node.val = temp1.val;
            temp1 = temp1.next;
            }
            else if(temp1.val > temp2.val){
            node.val = temp2.val;
            temp2 = temp2.next;
            }
            else{
                node.val = temp1.val;
                temp1 = temp1.next;
                ListNode n = new ListNode();
                node.next = n;
                node = n;
                node.val = temp2.val;
                temp2 = temp2.next;
            }
        }
        if(temp1 != null)
            node.next = temp1;
        else 
            node.next = temp2;
    return dummy.next;
    }
}