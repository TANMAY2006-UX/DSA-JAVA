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
    public ListNode sortList(ListNode head) {
        ListNode temp = head;
        int len = 0;
        while(temp!=null){
            len++;
            temp = temp.next;
        }
        int[] arr = new int[len];
        ListNode node = head;
        for(int i = 0; i < len ; i++){
            arr[i] = node.val;
            node = node.next;
            if(node == null){
                break;
            }
        }
        Arrays.sort(arr);
        ListNode NewHead = new ListNode();
        ListNode t = NewHead;
        for(int i = 0 ; i< len ; i++){
            ListNode n = new ListNode(arr[i]);
            t.next = n;
            t = t.next;
        }
        return NewHead.next;
    }
}