# Bubble Sort
Bubble Sort is the simplest and slowest sorting algorithm that works by repeatedly 
swapping the adjacent elements if they are not in correct order.
Example: 
First Iteration: 
(4,23,1,100,27)  –> ( 4,23,1,100,27 ), Here, algorithm compares the first two elements, and skips as 4 < 23
( 4,23,1,100,27 ) –>  ( 4, 1,23,100,27 ), Swap since 23 > 1 
( 4, 1,23,100,27) –>  ( 4, 1,23,100,27 ), No swappping as 23 < 100
( 4, 1,23,100,27) –>  ( 4, 1,23,27,100), Now, swap 100 and 27 as 100>27
Second Iteration: 
( 4, 1,23,27,100) –> ( 1, 4,23,27,100) , swap as 4 > 1
( 1, 4,23,27,100) –> ( 1, 4,23,27,100), No swapping as elements are already in order.
Now we can see our array is already sorted.However bubble sort algorith does not know if it completed.
So it continues with the iteration again
( 1, 4,23,27,100) –> ( 1, 4,23,27,100), No swapping as elements are already in order.
( 1, 4,23,27,100) –> ( 1, 4,23,27,100), No swapping as elements are already in order.
Third Iteration: 
( 1, 4,23,27,100) –> ( 1, 4,23,27,100), No swapping as elements are already in order.
( 1, 4,23,27,100) –> ( 1, 4,23,27,100), No swapping as elements are already in order.
( 1, 4,23,27,100) –> ( 1, 4,23,27,100), No swapping as elements are already in order.
( 1, 4,23,27,100) –> ( 1, 4,23,27,100), No swapping as elements are already in order.
