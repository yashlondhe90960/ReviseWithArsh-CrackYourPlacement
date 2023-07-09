
import java.util.*;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public List<Integer> findDuplicates(int[] nums) {
        List<Integer> resultSet = new ArrayList<>();

        for(int i=0;i<nums.length;i++){
             // get the index
             int index = Math.abs(nums[i]) -1;

             //if the number is already -ve we are encountering it twice

             if(nums[index] < 0){
                 resultSet.add(index+1);

             }

             //Flip the number at the index to negative
             nums[index] = nums[index]*-1;

        }
        return resultSet;
        
    }
}
