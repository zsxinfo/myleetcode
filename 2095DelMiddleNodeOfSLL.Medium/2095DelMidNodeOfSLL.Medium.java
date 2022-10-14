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
    public ListNode deleteMiddle(ListNode head) {
        if (head.next == null) return null;
        int count = 1;
        ListNode p = head;
        while (p.next != null) {
            count ++;
            p = p.next;
        }
        count = count/2;
        p = head;
        while (count != 1) {
            p = p.next;
            count--;
        }
        ListNode ans = p.next;
        p.next = p.next.next;
        return head;
    }
}

/*Runtime: 8 ms, faster than 41.53% of Java online submissions for Delete the Middle Node of a Linked List.
Memory Usage: 217.1 MB, less than 55.53% of Java online submissions for Delete the Middle Node of a Linked List. */