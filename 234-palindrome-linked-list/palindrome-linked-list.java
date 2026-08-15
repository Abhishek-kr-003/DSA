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
     public ListNode reverse(ListNode head){
        ListNode temp = head;
        ListNode prev = null;
        while(temp!=null){
            ListNode front = temp.next;
            temp.next = prev;
            prev = temp;

            temp = front;

        }
        return prev;
        }
    public boolean isPalindrome(ListNode head) {
       
        ListNode fast = head;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        ListNode newHead = reverse(slow);
        ListNode first = head;
        ListNode second = newHead;
         while (second != null) {
            if(first.val != second.val){
                return false;
            }
            first = first.next;
            second = second.next;
         }
         return true;

        
    }
}