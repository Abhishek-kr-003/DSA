
/*Definition for Singly Linked List
class ListNode {
    int val;
    ListNode next;

    ListNode() {
        val = 0;
        next = null;
    }

    ListNode(int data1) {
        val = data1;
        next = null;
    }

    ListNode(int data1, ListNode next1) {
        val = data1;
        next = next1;
    }
}
*/

class Solution {
    public ListNode middleNode(ListNode head) {
         ListNode fast = head;
         ListNode slow = head;

         while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
         }
         return slow;

    }
}
