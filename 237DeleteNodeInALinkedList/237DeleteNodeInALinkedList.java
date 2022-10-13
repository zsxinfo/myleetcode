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
        node.val = node.next.val;
        if (node.next.next != null) {
            node.next = node.next.next;
        } else {
            node.next = null;
        }
    }
}
/*Success
Details 
Runtime: 0 ms, faster than 100.00% of Java online submissions for Delete Node in a Linked List.
Memory Usage: 43.7 MB, less than 61.68% of Java online submissions for Delete Node in a Linked List.*/