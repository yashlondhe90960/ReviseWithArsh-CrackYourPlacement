import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/


//O(nlogn)
static boolean findPair(int arr[], int size, int n)
{
    // Step-1 Sort the array
    Arrays.sort(arr);
 
    // Initialize positions of two elements
    int l = 0;
    int r = 1;
 
    // take absolute value of difference
    // this does not affect the pair as A-B=diff is same as
    // B-A= -diff
    n = Math.abs(n);
 
    // Search for a pair
 
    // These loop running conditions are sufficient
    while (l <= r && r < size) {
        int diff = arr[r] - arr[l];
        if (diff == n
            && l != r) // we need distinct elements in pair
                        // so l!=r
        {
            System.out.print("Pair Found: (" + arr[l] + ", "
                + arr[r] + ")");
            return true;
        }
        else if (diff > n) // try to reduce the diff
            l++;
        else // Note if l==r then r will be advanced thus no
            // pair will be missed
            r++;
    }
    System.out.print("No such pair");
    return false;
}


//O(n)
// The function assumes that the array is sorted
  static boolean findPair(int[] arr, int size, int n)
  {
    HashMap<Integer,
            Integer> mpp = new HashMap<Integer,
                                      Integer>();
 
     // Traverse the array
    for(int i = 0; i < size; i++)
    {
          
        // Update frequency
        // of arr[i]
        mpp.put(arr[i],
               mpp.getOrDefault(arr[i], 0) + 1);
       
        // Check if any element whose frequency
        // is greater than 1 exist or not for n == 0
        if (n == 0 && mpp.get(arr[i]) > 1)
            return true;
    }
  
     // Check if difference is zero and
    // we are unable to find any duplicate or
    // element whose frequency is greater than 1
    // then no such pair found.
    if (n == 0)
        return false;
 
    for (int i = 0; i < size; i++) {
      if (mpp.containsKey(n + arr[i])) {
        System.out.print("Pair Found: (" + arr[i] + ", " +
                      + (n + arr[i]) + ")");
        return true;
      }
    }
    System.out.print("No Pair found");
    return false;
  }
 