

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public int findDuplicate(int[] nums) {
      int left = 1, right = nums.length;
      while(left<right){
          int mid = left + (right-left)/2;
          int count =0;

          for( int num : nums){
              if(num <= mid){
                  ++count;

              }}
              if(count <= mid){
                  left = mid+1;

              }else right = mid;

          
        

      }
        return right;

    }
}


  // Arrays.sort(nums);
        // for(int i=1;i<nums.length;i++){
        //     if(nums[i]== nums[i-1]){
        //         return nums[i];

        //     }
        // }
        // return -1;