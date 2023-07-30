import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


class Solution {
    public int findPeakElement(int[] nums) {
        //linear search
        //tc=O(n), sc=o(1)
        // int n=nums.length;
        // for(int i=0;i<n;i++)
        // {
        //     if((i==0 || nums[i-1]<nums[i]) && (i==n-1 || nums[i]>nums[i+1]))
        //     return i;
        // }
        // return 0;

        //Binary Search
        //tc=O(log n)
        int n=nums.length;
        if(n==1) return 0;
        if(nums[0]>nums[1]) return 0;
        if(nums[n-1]>nums[n-2]) return n-1;
        int l=1, r=n-2;
        while(l<=r)
        {
            int mid=l+(r-l)/2;
            if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]) return mid;
            else if(nums[mid]>nums[mid-1]) l=mid+1;
            else  r=mid-1;                //if(nums[mid]>nums[mid+1])
        }
        return -1;

    }
}