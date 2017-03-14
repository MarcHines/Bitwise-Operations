/*
Below are some essential things things that we can do with bitwise operators
Let int x be the bit we wish to perform operations on, and let int number be the given input, ie. int number = 23;
*/


 //SETTING A BIT: We can set any bit of our choosing.ie, make a 0 bit 1.
  number |= 1 << x;
  
 //Clearing A BIT: We can clear any bit of our choosing.ie, make a 1 bit 0.
   number &= ~(1 << x);
   
 //TOGGLING A BIT: We can switch any bit to the opposite of what it is.
   number ^= 1 << x;
   
//SELECTING A BIT: We cab select and store the value of any bit in an integer variable
   int bit = (number >> x) & 1;
