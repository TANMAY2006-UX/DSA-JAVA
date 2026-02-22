/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode temp1 = headA;
        ListNode temp2 = headB;
        int i = 0;
        int j = 0;
        while(temp1 != null && temp2 != null){
            if(temp1 == temp2) return temp1;
            if(i == 0 && temp1.next == null){
            temp1 = headB;
            temp2 = temp2.next;
            i++;
            }
            else if(j == 0 && temp2.next == null){
            temp2 = headA;
            temp1 = temp1.next;
            j++;
            }
            else{
            temp1 = temp1.next;
            temp2  = temp2.next;
            }
        }
        return null;
    }
}