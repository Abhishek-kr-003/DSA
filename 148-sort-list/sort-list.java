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
    public ListNode merge(ListNode list1, ListNode list2){
        ListNode dummy = new ListNode(-1,null);
        ListNode temp = dummy;

        while(list1!=null && list2!=null){
            if(list1.val <= list2.val){
                temp.next = list1;
                list1=list1.next;

            }
            else{
                temp.next = list2;
                list2 = list2.next;
            }
            temp = temp.next;
        }
        if(list1!=null){
            temp.next = list1;
        }
        if(list2!=null){
            temp.next = list2;
        }
        return dummy.next;
    }
 
    public ListNode findMiddle(ListNode head){
       if(head==null||head.next==null){
            return head;
        }
        ListNode fast = head.next;
        ListNode slow = head;
        while(fast != null && fast.next != null){
            fast = fast.next.next;
            slow = slow.next;
        }
        return slow;
    }

    public ListNode sortList(ListNode head) {
         if(head == null || head.next == null){
            return head;
         }
         ListNode middle = findMiddle(head);

         ListNode right = middle.next;
         middle.next = null;
         ListNode left = head;

         right = sortList(right);
         left = sortList(left);

         return merge(left,right);
    }
}