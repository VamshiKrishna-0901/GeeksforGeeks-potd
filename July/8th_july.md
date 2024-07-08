# Search in Rotated Sorted Array

Given :    <br>
![image](https://github.com/VamshiKrishna-0901/GeeksforGeeks-potd/assets/167741103/e393756c-c0ec-4196-b0a1-46846556df10)

The required time complexity of the program : O(log n) <br>
Linearly searching an element in the array takes O(n). <br>
While we cannot do the binary search as it require array to be sorted. And our array is also sorted but is rotated.
<br>

- To find the index of given key we can use two pointer to search the key which takes O(log n)
- We can take two variables <b>i = 0</b> and <b>j = n - 1</b>
- we can run the loop till two variables meet and if we can find the key we can return the index
- Else we can return -1
- This approach decreases the liner time complexity by half
  <br> <br> <br>

```Java
  while (i <= j) {
    if (arr[i++] == key) return i;
    else if (arr[j--] == key) return j;
  }

  return -1;
}
```
