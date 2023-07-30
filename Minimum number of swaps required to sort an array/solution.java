import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


class Solution
{
    public int solveWordWrap (int[] nums, int k)
    {
        int n = nums.length;
        
         // initialize total cost
    int total_cost = 0;
    for (int i = 0; i < n - 1; i++)
    {
 
      // size of window left after the current element
      int size = k - 1 - nums[i];
 
      // cost of current line
      int sum = k - nums[i];
      while (size >= 0)
      {
        size = size - nums[i + 1] - 1;
 
        // breaks immediately
        if (size < 0) {
          break;
        }
        sum = sum - nums[i] - 1;
        i++;
      }
 
      // add current cost to total cost
      total_cost = total_cost + (sum * sum);
    }
 
    // print the total cost
    return total_cost;
    
  }
}