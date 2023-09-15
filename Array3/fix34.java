
/*
 * Return an array that contains exactly the same numbers as 
 * the given array, but rearranged so that every 3 is 
 * immediately followed by a 4. Do not move the 3's, but every 
 * other number may move. The array contains the same number of 
 * 3's and 4's, every 3 has a number after it that is not a 3, 
 * and a 3 appears in the array before any 4.
 */
 
public int[] fix34(int[] nums) {
  // loop through the array
  
  // inside the array find a 3
  // loop through the array again once a 4 is found
  // switch the index in front of the 3 and the found 4
  
  int last4Index = 0;
  for(int i = 0; i < nums.length - 1; i++) {
    if(nums[i] == 3) {
      for(int j = last4Index + 1; j < nums.length; j++) {
        if(nums[j] == 4) {
          int hold = nums[i + 1];
          nums[i + 1] = 4;
          nums[j] = hold;
          
          last4Index = j;
          break;
        }
      }
    }
  }
  return nums;
}
