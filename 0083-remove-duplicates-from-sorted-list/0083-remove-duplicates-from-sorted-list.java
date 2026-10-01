class Solution {
    public ListNode deleteDuplicates(ListNode head) {
        if(head == null) {
            return null;
        }

        ListNode first = head;
        ListNode second = first.next;

        while(second != null) {
            if(first.val == second.val) {
                first.next = second.next;
                second = first.next;
            } else {
                first = second;
                second = second.next;
            }
        }

        return head;
    }
}