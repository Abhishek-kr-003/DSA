/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) { val = x; }
 * }
 */

class Solution {
    public void deleteNode(ListNode node) {
         
         node.val = node.next.val;   //here we were not given the previous node or the head node so what we do is that we assign the curre
         node.next = node.next.next;

    }
}