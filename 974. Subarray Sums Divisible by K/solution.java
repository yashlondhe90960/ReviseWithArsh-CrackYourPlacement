import java.util.HashMap;
import java.util.Map;

/**
 * @author : yashlondhe90960
 
*/

//Method 1 by Prefix sum
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


//Method 2 by HashMap

class Solution {
    public int subarraysDivByK(int[] nums, int k) {
        int ans = 0;
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0,1);
        int sum = 0;
        int rem = 0;
        for(int i=0;i<nums.length;i++){
            sum += nums[i];
            rem = sum % k;
            if(rem<0){
                rem += k;

            }
            if(map.containsKey(rem)){
                ans += map.get(rem);
                map.put(rem, map.get(rem) +1);

            } else{
                map.put(rem,1);

            }


        }
        return ans;


    }
}
