/*
  Given 3 int values, a b c, return their sum. However, 
  if any of the values is a teen -- in the range 13..19 
  inclusive -- then that value counts as 0, except 15 
  and 16 do not count as a teens. Write a separate helper 
  "public int fixTeen(int n) {"that takes in an int value 
  and returns that value fixed for the teen rule. In this 
  way, you avoid repeating the teen code 3 times (i.e. 
  "decomposition"). Define the helper below and at the same 
  indent level as the main noTeenSum().
*/

public int noTeenSum(int a, int b, int c) {
  // made into array so that I would have many if statements
  int arr[] = {a, b, c};
  
  // counter adds values that fall into requirements
  int counter = 0;
  
  for(int x : arr) {
    
    // check to make sure the parameter value is not a 'teen
    // exception of 15 and 16
    if(fixTeen(x) != 0) {
      
      //add the value if 'teen
      counter += x;
    }
  }
  
  return counter;
}

// helper method
public int fixTeen(int num) {
  // check the requirements for 'teen value
  if(num == 13 || num ==14 || num >= 17 && num <= 19) {
    return 0;
  }
  return num;
}