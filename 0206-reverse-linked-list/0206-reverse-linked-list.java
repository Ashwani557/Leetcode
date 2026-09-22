class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode curr = head;
        ListNode prev = null;
        ListNode next = null;

        while(curr != null) {
            next = curr.next;   // save next node
            curr.next = prev;   // reverse the link
            prev = curr;        // move prev forward
            curr = next;        // move curr forward
        }

        return prev;
    }
}