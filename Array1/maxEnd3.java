
/*
  Given an array of ints length 3, figure out which 
  is larger, the first or last element in the array, 
  and set all the other elements to be that value. 
  Return the changed array.
*/


public int[] maxEnd3(int[] nums) {
  
  //reuse variables
  int first = nums[0];
  int last = nums[nums.length - 1];
  
  // check which one is bigger (first or last)
  if(first > last) {
    return makeArray(first);
  }
  
  return makeArray(last);
}

// Helper Method: creates a new int array with all indexes
// being the same number given in the parameter
private int[] makeArray(int num) {
  int arr[] = new int[3];
  for(int i = 0; i < arr.length; i++) {
    arr[i] = num;
  }
  return arr;
}



