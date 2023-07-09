import java.util.HashMap;
import java.util.Map;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int[] prefixSums = new int[nums.length+1];
        for(int i=1;i<= nums.length;i++){
            prefixSums[i] = prefixSums[i-1]+nums[i-1];

        }
        int[] remainders = new int[k];
        int count =0 ;
        for(int i=0;i<= nums.length;i++){
            int remainder = prefixSums[i] % k;
            if(remainder < 0){
                remainder += k;

            }
            count += remainders[remainder];
            remainders[remainder]++;

        }
        return count;

    }
}