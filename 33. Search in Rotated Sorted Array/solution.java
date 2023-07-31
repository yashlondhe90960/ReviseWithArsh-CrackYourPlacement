import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


  public class Solution {

        public int search(int[] nums, int target) {

            if (nums == null || nums.length == 0) {
                return -1;
            }

            int i = 0; // left pointer
            int j = nums.length - 1; // right pointer

            while (i <= j) {
                int mid = (i + j) / 2; 
                if (nums[mid] == target) {
                    return mid;
                }


                
                if (nums[i] <= nums[mid]) { // left half ordered, right half not ordered

                    // if (target <= nums[mid]) {
                    if (nums[i] <= target && target <= nums[mid]) {
                        j = mid - 1;
                    } else {
                        // i++; //[NOT binary]
                        i = mid + 1;
                    }
                } else { // right half ordered, left half not ordered

                    // if (target <= nums[mid]) {
                    if (nums[mid] <= target && target <= nums[j]) {
                        i = mid + 1;
                    } else {
                        // j--; //[NOT binary]
                        j = mid - 1;
                    }
                }
            }

            return -1;
        }
    }