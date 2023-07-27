# Permute two arrays such that sum of every pair is greater or equal to K

## Description

Given two arrays of equal size n and an integer k. The task is to permute both arrays such that sum of their corresponding element is greater than or equal to k i.e a[i] + b[i] >= k. The task is to print “Yes” if any such permutation exists, otherwise print “No”.

Example 1:


```
Input : a[] = {2, 1, 3}, 
        b[] = { 7, 8, 9 }, 
        k = 10. 
Output : Yes
Permutation  a[] = { 1, 2, 3 } and b[] = { 9, 8, 7 } 
satisfied the condition a[i] + b[i] >= K.
```

Example 2:

```
Input : a[] = {1, 2, 2, 1}, 
        b[] = { 3, 3, 3, 4 }, 
        k = 5. 
Output : No
```

<!-- # ![Alt](https://assets.leetcode.com/uploads/2021/03/27/perectrec1-plane.jpg) -->