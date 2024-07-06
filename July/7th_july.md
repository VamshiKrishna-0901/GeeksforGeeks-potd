# Ancestors in Binary Tree

### Binary Tree :
 Binary tree is a tree data structure(non-linear) in which each node can have at most two children which are referred to as the left child and the right child.
 <br><br>
 
Given a Binary tree let's say : <br><br>
![image](https://github.com/VamshiKrishna-0901/GeeksforGeeks-potd/assets/167741103/9577c092-e8a5-4cdb-849c-3dbc9423f100)

To find the target value of 7 from the above tree, Traverse back to it's parent node which is in this case '4' <br><br>
![image](https://github.com/VamshiKrishna-0901/GeeksforGeeks-potd/assets/167741103/8f92b6ff-e582-4f1d-ab89-e96de447a57e)

Likewise we would traverse our way back to the root element and add those elements to the array as we tarverse back : [4, 2, 1] <br><br>
![image](https://github.com/VamshiKrishna-0901/GeeksforGeeks-potd/assets/167741103/ad954e38-2b63-4e7e-94e2-bacb0519b1b6)


<br><br>
For first we have to traverse to the target element int the graph which should be returned by true <br>
``` Java
 boolean traverse(Node node, int target) {
   if (node == null) { return false; }
   if (node.data == target) { return true; }
}
```
<br><br>


We would land on the target value from where we'd be thrown back to the start position <br> 
It's called back-tracking. We should add elements to the array from which the returning value is true.
```Java
//Create a static array to store the value
static ArrayList<Integer> array = new ArrayList<>();
```
<br><br>


The following code should be included in the traverse block to catch the values which are used to find the target value.
```Java
if (traverse(node.left, target) || traverse(node.right, target) {
  array.add(node.value);
  return true;
}

return false;
```
<br><br>


The main block of the code is used to call traverse method. Since our array is static it gets initialized in the recursive calls
```Java
ArrayList<Integer> ancestors(Node node, int target) {
  traverse(node, target);
  return array;
}
```
