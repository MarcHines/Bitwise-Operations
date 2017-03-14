/*
Given an array of integer where each integer appears twice except for one integer return the non duplicated integer 
ie. array = {1,1,3,3,4,55,55,2,3,3,2} Result: 4
Of course we could use a map to count the occurences of each integer...blah blah blah, but thats not cool.
Using XOR we can accomplish the solution. Anythig XOR with itself cancels out. We are then left with the
not duplicated value
*/


public int nonDuplicate(int arr[]){
  int result = 0;
  
  for(int i : arr)
    result ^= i;
    
   return result; 
}
