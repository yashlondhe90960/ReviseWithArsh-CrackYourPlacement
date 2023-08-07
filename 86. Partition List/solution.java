import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


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
    public ListNode partition(ListNode head, int x) {
        // Create two dummy nodes to hold elements less than x (small) and greater than or equal to x (higher)
        ListNode small = new ListNode(0);
        ListNode higher = new ListNode(0);

        // Create pointers for the heads of the small and higher lists
        ListNode smallHead = small, higherHead = higher;

        // Traverse the original list
        while (head != null) {
            if (head.val < x) {
                // If the current element is less than x, add it to the small list
                smallHead.next = head;
                smallHead = smallHead.next;
            } else {
                // If the current element is greater than or equal to x, add it to the higher list
                higherHead.next = head;
                higherHead = higherHead.next;
            }
            
            // Move to the next node in the original list
            head = head.next;
        }
        
        // Set the next of higherHead to null to terminate the higher list
        higherHead.next = null;

        // Connect the end of the small list to the beginning of the higher list
        smallHead.next = higher.next;

        // Return the head of the sorted list (small list)
        return small.next;
    }
}
