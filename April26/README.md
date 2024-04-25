# Maximum Sum of Hour Glass 

### Question Breakdown

- There is a matrix of n*m which may or may not has an hour glass pattern such as
 ![solid](https://media.geeksforgeeks.org/img-practice/prod/addEditProblem/705187/Web/Other/blobid1_1710860182.png)

- If there is a hourglass add up the numbers which comes under those format and print the maximum sum is there are more than one hourglass. 
- In the other case if you don't have any hourglass patterns just return `-1`. 

### Observation - 1

- An hour glass which occupies 7 cells of 3 rows and 3 columns so we can deduce that shpae of matrix should be always more than or equal to 3 rows and 3 columns.
- If your matrix satisfies above conditions then at every cell (index) you need to check two condtions :
  - First are the 2 rows from my present cell are available or present? It gives your row sum.
  -  Second are there 2 columns from my present cell are present? It can used to find middle element 'D' and last row sum.
- If any cell satisfies the conditions add up the numbers in houglass format. `a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2]`


## Base Conditions
```
    if ( n < 3 || m < 3 ) { return -1; }
```
```
   ( a[i][j] + a[i][j+1] + a[i][j+2] + a[i+1][j+1] + a[i+2][j] + a[i+2][j+1] + a[i+2][j+2] ) should be valid
```