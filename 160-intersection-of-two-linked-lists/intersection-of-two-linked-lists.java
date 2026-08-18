/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode(int x) {
 *         val = x;
 *         next = null;
 *     }
 * }
 */
public class Solution {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode llA = headA;
        ListNode llB = headB;
        int cntA = 0;
        int cntB = 0;
       
        while(llA != null){
             cntA++;
             llA=llA.next;
             }
        while(llB != null){
             cntB+=1;
             llB = llB.next;
             }
        llA = headA;
        llB = headB;

        if(cntA>cntB){
            int diff = cntA-cntB;
            while(diff>0){
                llA = llA.next;
                diff--;
            }
            
        }
        else{
            int diff = cntB-cntA;
            while(diff>0){
                llB = llB.next;
                diff--;
            }
        }
        while(llA != llB){
            llA= llA.next;
            llB = llB.next;
        }
        return llB;
    }
}