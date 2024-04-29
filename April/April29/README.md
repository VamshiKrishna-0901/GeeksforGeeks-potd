# Remove every kth node

## Question Breakdown
- The problem states that for given "k", we should remove every kth element from the linked list.  

- For example : 1 -> 2 -> 3 -> 4 -> 5 -> 6  
        k =  3
The new linked list would be : 1 -> 2 -> 4 -> 5
<br>

## Intuition - 1 (Basic)
- From the observation it is clear that for every Kth step we have to ignore the node and proceds to another.

- Initialize the count variable to 0 and increment till it reaches K. And dereference that node and reset your count variable.  
<br>

## Intuition - 2 (Recursive)
- Run a loop from 1 to K - 1. dereference the Kth node with it's next node (called head) if there is any.

- Now recursive call with the head linked to k-1th node till the head is empty. return the head.
<br>

## Base Case
- Normal base case would be if k = 1. As every other element would be deleted.
```java
if ( k == 1 )  { return null; }
```

- Recursive base case would have the condition mentioned above and where the head is null.
```java
if ( head == null ) { return null; }
