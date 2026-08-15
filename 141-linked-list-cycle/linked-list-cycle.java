/*Definition of singly linked list:
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
    public boolean hasCycle(ListNode head) {
         ListNode fast = head;
         ListNode slow = head;

         while(fast!=null && fast.next!=null){
            fast = fast.next.next;   // if there is a loop fast and slow will eventully meet in the loop
            slow = slow.next;
            if(fast== slow){
                return true;
         
            }
         }
         return false;
    }
}