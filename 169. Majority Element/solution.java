import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/

class Solution {
    public int majorityElement(int[] nums) {
          int res = 0, cnt = 0;
            for (int num : nums) {
                if (cnt == 0) {res = num; ++cnt;}
                else if (num == res) ++cnt;
                else --cnt;
            }
            return res;
    }
}
