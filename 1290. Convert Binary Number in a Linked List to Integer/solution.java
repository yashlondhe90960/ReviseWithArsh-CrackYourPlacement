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
    public int getDecimalValue(ListNode head) {

        int sum = 0;
        while(head != null){
            sum = sum*2 + head.val;
            head = head.next;

        }
        return sum;
        // Stack<Integer> stack = new Stack<>();
        // while(head != null){
        //     stack.push(head.val);
        //     head = head.next;

        // }
        // int temp = 1;
        // int sum = 0;
        // while(!stack.isEmpty()){
        //     sum += temp * stack.pop();
        //     temp *= 2;

        // }
        // return sum;



    }
}