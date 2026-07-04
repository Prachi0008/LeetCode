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
        ListNode prev = null;
        ListNode curr = head;

        while(curr!=null){
            ListNode temp = curr.next; // saving the rest list after head/curr
            curr.next=prev; // reversing LL
            prev=curr; // growing the reversed LL
            curr=temp; // continue LL
        }
        return prev;
    }
}