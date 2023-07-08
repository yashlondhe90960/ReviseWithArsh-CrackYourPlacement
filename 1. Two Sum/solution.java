import java.util.HashMap;
import java.util.Map;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public int[] twoSum(int[] nums, int target) {
        //creating a hashmap
        Map<Integer, Integer> map = new HashMap<>();

        for(int i=0;i<nums.length;i++){
            //get the complement

            int complement = target - nums[i];

            // search hashmap for complement, if found Yayy!!
            if( map.containsKey(complement)){
                return new int[]{map.get(complement),i};
            }
                //put the element in hashmap for subsequent searches
                map.put(nums[i], i);

        }
          

        
          
throw new IllegalArgumentException("No 2 sum solution");
       

    }
}




// arrray solution

//  for(int i=0;i<nums.length;i++)
//         {
//            for(int j=i+1;j<nums.length;j++){
//                if(nums[i]+nums[j] == target){
//                    int a[] = {i,j};
//                    return a;

//                }
//            }
//         }
//         return null;