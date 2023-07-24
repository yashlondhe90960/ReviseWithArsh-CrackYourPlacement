import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public boolean isHappy(int n) {
        // Initialize two variables slow and fast with the value of 'n'
        int slow = n;
        int fast = n;

        // Use a do-while loop to detect cycles in the number sequence
        do {
            // Move 'slow' one step ahead by finding the square of its digits sum
            slow = findSquare(slow);
            
            // Move 'fast' two steps ahead by finding the square of the digits sum twice
            fast = findSquare(findSquare(fast));

        // Continue looping until 'fast' becomes equal to 'slow' (cycle detected)
        } while (fast != slow);
        
        // Check if the loop ended because 'slow' became 1, indicating it is a happy number
        if (slow == 1) {
            return true;
        }
        
        // If the loop ended but 'slow' is not 1, then it's not a happy number
        return false;
    }
    
    // Helper method to find the sum of squares of the digits of a number
    private int findSquare(int number) {
        int ans = 0;
        while (number > 0) {
            int rem = number % 10; // Get the last digit of the number
            ans += rem * rem; // Square the digit and add it to 'ans'
            number /= 10; // Remove the last digit from 'number'
        }
        return ans; // Return the sum of squares of the digits
    }
}
