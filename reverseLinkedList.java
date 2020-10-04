// Runtime: 0 ms, faster than 100.00% of Java online submissions for Reverse Linked List.
// Memory Usage: 38.5 MB, less than 99.33% of Java online submissions for Reverse Linked List.

class Solution {
    public ListNode reverseList(ListNode head) {
        
        ListNode curr= head; 
        ListNode prev= null; 

        while(curr!=null) {
            ListNode next=curr.next;
            curr.next=prev; 
             prev=curr; 
            curr=next;
        }
        return prev;
    }
}
