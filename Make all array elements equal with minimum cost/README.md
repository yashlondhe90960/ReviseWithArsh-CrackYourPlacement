# Make all array elements equal with minimum cost

## Description

Given an array which contains integer values, we need to make all values of this array equal to some integer value with minimum cost where the cost of changing an array value x to y is abs(x-y). 

Example 1:


```
Input  : arr[] = [1, 100, 101]
Output : 100
We can change all its values to 100 with minimum cost,
|1 - 100| + |100 - 100| + |101 - 100| = 100
Input  : arr[] = [4, 6]
Output : 2
We can change all its values to 5 with minimum cost,
|4 - 5| + |5 - 6| = 2
```

<!-- # ![Alt](https://assets.leetcode.com/uploads/2021/03/27/perectrec1-plane.jpg) -->