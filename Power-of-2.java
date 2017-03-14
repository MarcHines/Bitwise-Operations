/*
Given an integer, write a function that will determine if that number is a power of 2
ie; Input: 16, Result = true
    Input: 35, Result = false;
*/

//Think aobut Twos Complement
public boolean powerOfTwo(int n){
  if(n <= 0) return false;
  return n == (n & -n);
}

//Another approach: If the number of set bits 1, then it is a power of two.
public booean powerofTwo(int n){
  if(n <= return false;
  return  Integer.bitCount(n) == 1;
}
