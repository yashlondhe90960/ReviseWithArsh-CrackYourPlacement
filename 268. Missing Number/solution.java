import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public int missingNumber(int[] nums) {
        int allXOR = 0;

        //XOR all numbers in range [0,n]
        for(int i=0;i<=nums.length;i++){
            allXOR = allXOR ^ i;

        } 

        //XOR all numbers in the given array
        for(int num: nums){
            allXOR = allXOR ^ num;

        }

        //returning missing number
        return allXOR;

    }
}