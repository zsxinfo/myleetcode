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
    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int val = l1.val + l2.val;
        int digit = val % 10;
        int up = val / 10;
        ListNode ans = new ListNode(digit);
        ListNode p = ans;
        l1 = l1.next;
        l2 = l2.next;
        while(l1 != null && l2 != null) {
            val = l1.val + l2.val + up;
            digit = val % 10;
            up = val / 10;
            p.next = new ListNode(digit);
            p = p.next;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (l1 == null) {
            while(l2 != null) {
                val = l2.val + up;
                digit = val % 10;
                up = val / 10;
                p.next = new ListNode(digit);
                p = p.next;
                l2 = l2.next;
            }
        }
        if (l2 == null) {
            while(l1 != null) {
                val = l1.val + up;
                digit = val % 10;
                up = val / 10;
                p.next = new ListNode(digit);
                p = p.next;
                l1 = l1.next;
            }
        }
        if (up == 1) {
            p.next = new ListNode(1);
        }
        return ans;
    }
    
    
}

/* Runtime: 4 ms, faster than 46.75% of Java online submissions for Add Two Numbers.
Memory Usage: 47.6 MB, less than 61.85% of Java online submissions for Add Two Numbers. */