class Solution {
    public ListNode reverseBetween(ListNode head, int left, int right) {
        if(head == null || left == right){
            return head;
        }
        ListNode prev = null;
        ListNode curr = head;

        for(int i=1;i<left;i++){
            prev=curr;
            curr=curr.next;
        }
        ListNode connection = prev;
        ListNode tail = curr;
        //first reverse the list
        for(int i = 0 ; i < right - left + 1 ; i++){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        if(connection!=null){
            connection.next=prev;
        }
        else{ 
            head=prev;
            }
        tail.next=curr;
        return head;
    }
}