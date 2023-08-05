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
  public ListNode reverseList(ListNode head) { ListNode prev = null;
          if(head==null){
              return head;
          }                                 
                                              
      ListNode present = head;
      ListNode next = present.next;

      while (present != null) {
          present.next = prev;
          prev = present;
          present = next;
          if (next != null) {
              next = next.next;
          }
      }
     return prev;
      
  }
}

//recursive way
// class Solution{
//     public ListNode reverseList(ListNode head){
//         //base case
//         if(head==null || head.next == null){
//             return head;
//         }

//         //recursively reverse the rest of LL starting from second node
//         ListNode reversed = reverseList(head.next);
      
//         //reverse connection between the curr and next node
//         head.next.next = head;
//         head.next = null;

//         return reversed;


      
//     }
// }