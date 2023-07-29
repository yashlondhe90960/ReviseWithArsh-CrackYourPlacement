import java.util.Arrays;

/**
 * @author : yashlondhe90960
 
*/

public class MinCostToEqualizeArray {
    public static int minCostOptimized(int[] arr) {
        Arrays.sort(arr);
        int n = arr.length;
        int median1 = arr[n / 2];
        int median2 = arr[n / 2 - 1];

        // Calculate total cost for both medians and choose the minimum cost
        int cost1 = 0, cost2 = 0;
        for (int i = 0; i < n; i++) {
            cost1 += Math.abs(arr[i] - median1);
            cost2 += Math.abs(arr[i] - median2);
        }

        return Math.min(cost1, cost2);
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 100, 101};
        System.out.println(minCostOptimized(arr1)); // Output: 100

        int[] arr2 = {4, 6};
        System.out.println(minCostOptimized(arr2)); // Output: 2
    }
}
