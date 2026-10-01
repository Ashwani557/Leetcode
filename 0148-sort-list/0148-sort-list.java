// class Solution {
//     public ListNode sortList(ListNode head) {
//         if(head == null || head.next == null) {
//             return head;
//         }

//         ListNode first = head;

//         while(first != null) {
//             ListNode second = first.next;

//             while(second != null) {
//                 if(first.val > second.val) {
//                     int temp = first.val;
//                     first.val = second.val;
//                     second.val = temp;
//                 }

//                 second = second.next;
//             }

//             first = first.next;
//         }

//         return head;
//     }
// }
class Solution {
    public ListNode sortList(ListNode head) {
        if(head == null || head.next == null) {
            return head;
        }

        // Find middle
        ListNode slow = head;
        ListNode fast = head.next;

        while(fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        // Split into two lists
        ListNode second = slow.next;
        slow.next = null;

        // Sort both halves
        ListNode first = sortList(head);
        second = sortList(second);

        // Merge
        ListNode dummy = new ListNode(0);
        ListNode curr = dummy;

        while(first != null && second != null) {
            if(first.val < second.val) {
                curr.next = first;
                first = first.next;
            } else {
                curr.next = second;
                second = second.next;
            }

            curr = curr.next;
        }

        if(first != null) {
            curr.next = first;
        } else {
            curr.next = second;
        }

        return dummy.next;
    }
}