import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public String intToRoman(int num) {
        // 1. 1 <= digit <= 3, append that digit number of Roman
        //         2. digit = 4, append "I"+Roman
        //         3. digit = 5,10, etc... append Roman
        //         4. 6 <= digit <= 8, append Roman+"I"
        //         5. digit = 9, append "I"+Roman

        String[] symbols = {"M","CM","D","CD","C","XC","L","XL","X","IX","V","IV","I"};

        int[] values = {1000,900,500,400,100,90,50,40,10,9,5,4,1};
        StringBuilder result = new StringBuilder();

        for(int i=0;i<values.length;i++){
            while(num >= values[i]){
                result.append(symbols[i]);
                num -= values[i];

            }
        }
        return new String(result);
        
    }
}

// second solution
/*
 int[] nums = new int[] {1000,900,500,400,100,90,50,40,10,9,5,4,1};
 String[] romans = new String[] {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
 StringBuilder sb = new StringBuilder();
 for(int i=0;i<nums.length;++i){
     while(num >= nums[i]){
         num -= nums[i];
         sb.append(romans[i]);

     }
 }
 return sb.toString();


*/
