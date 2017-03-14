/*
Given an array of integer where each integer appears twice except for one integer return the non duplicated integer 
ie. array = {1,1,3,3,4,55,55,2,3,3,2} Result: 4
*/


public int nonDuplicate(int arr[]){
  int result = 0;
  
  for(int i : arr)
    result ^= i;
    
   return result; 
}
