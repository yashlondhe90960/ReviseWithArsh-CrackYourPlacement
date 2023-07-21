
/**
 * @author : yashlondhe90960
 
*/


import java.io.*;
class Main
{
// Function to find majority element 
public static int majorityElement(int nums[])
{
	int count = 0, maj_ele = nums[0];
	// Finding majority element
	for (int i = 0; i < nums.length; i++) {
	if (count == 0) {
       maj_ele = nums[i];
		count = 1;
	}
	else {
		if (nums[i] == maj_ele)
		count++;
		else
		count--;
	}
	}
	// Checking if majority element occurs more than N/2 times
	for (int i = 0; i < nums.length; i++) {
	if (nums[i] == maj_ele)
		count++;
	}
	if (count > (nums.length / 2))
	return maj_ele;
	return -1;
}
// Driver code
public static void main(String[] args)
{
	int arr[] = { 1, 1, 1, 1, 2, 3, 5 };
	int majority = majorityElement(arr);
	System.out.println(" The majority element is " + majority);
	}
}