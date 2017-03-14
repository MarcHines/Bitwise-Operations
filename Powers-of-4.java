/*Determine if a given number is a power of 4 */

//This solution is identical to power of two. The only difference is that powers of 4 must ALSO have even number of trailing zeros

public boolean powerOfFour(int n){
  if(n <= 0) return false;
  return n == (n & -n) && Integer.numberOfTrailingZeros(n) % 2 == 0;
}
