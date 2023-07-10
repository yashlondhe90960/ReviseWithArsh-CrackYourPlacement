import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * @author : yashlondhe90960
 * 
 */

class Solution {
    public List<List<Integer>> threeSum(int[] nums) {

        // sort first
        Arrays.sort(nums);
        Set<List<Integer>> result = new HashSet<>();

        // fix one num and find other two nums using 2 sum approach
        for (int i = 0; i < nums.length - 2; i++) {

            int left = i + 1;
            int right = nums.length - 1;

            while (left < right) {
                int sum = nums[i] + nums[left] + nums[right];
                if (sum == 0) {
                    // add to set
                    result.add(Arrays.asList(nums[i], nums[left], nums[right]));
                    left++;
                    right--;

                } else if (sum < 0) {
                    left++;

                } else
                    right--;

            }

        }

        return new ArrayList<>(result);

    }
}