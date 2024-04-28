# Delete Middle Element of LL

## Question Breakdown
- Given the reference of head in method now we have to delete the middle element
- If the length of linked list is odd. Ex: 1 -> 2 -> 3 then 2 is removed.
- On the contrary case even. Ex: 1 -> 2 -> 3 -> 4. 
- Middle elements would be both '2' and '3'. so we have to delete the second element from the two i.e., "3".

### How to delete the element
- To delete the element in the linked list we just have to change the reference of deleting node to it's next node.
- In simple terms : if 1 -> 2 -> 3 ( 1.next is 2, 2.next is 3) then to delete 2 we have to change the next value to 3 i.e., 1.next = 2.next.
- From this we can say that node 2 is dereferenced.

## Intuition - 1
- We can count the length of linked list and divide it to get middle value 
- Using while loop we can delete the middle node.

``
temp = head, node_to_be_deleted = null, count = 1; 
while ( count != middle_index ) {
    node_to_be_deleted = temp;
    temp = temp.next;
}

//Once you find the node to be deleted using above example mentioned in how to delete dereference the node.

temp.next = node_to_be_deleted.next;
``

## Intuition - 2
- Two pointer approach O(n / 2)
- Here we use two pointer that starts from head and the first pointer jumps sequentially and second pointer jumps two steps from it's place.
- To understand this let us see an example.
- 1 2 3 4 5 6
- initially first and second pointer points head (1).
- In consecutive iterations the values change as follows :
- first_pointer = 2;    second_pointer = 3;
- first_pointer = 3;    second_pointer = 5;
- first_pointer = 4;    second_pointer = null;
- Note: second pointer jumps two steps from 5 there is only one node the reference of node 6 points to hence second pointer is null.
- This approach always help first pointer to land on middle value.
- Now since we have a node that is to be deleted we can use it to dereference it.

## Base Case
- If there are two nodes we can delete the second node. but if there is only one node we can directly delete it.

`` if( head.next == null ) { return null; } ``