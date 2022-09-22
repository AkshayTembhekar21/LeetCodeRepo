/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public ListNode removeNthFromEnd(ListNode head, int n) {
        
        ListNode left = head;
        ListNode right = head;
        
        int i = 0;
        while(i < n && right !=null){
            right = right.next;
            i++;
        }
        
        if(right == null)
            return head.next;
        
        while(right.next != null){
            left = left.next;
            right = right.next;
        }
        
        left.next = left.next.next;
        
        return head;
        
    }
}