public int[] shiftLeft(int[] nums) {
  
  // declare and instantiate a new array
  int n[] = new int[nums.length];
  
  //handle exception
  if(nums.length == 0) return n;
  
  // copy the array starting from index 1 to the end
  // copy by iterating through the array
  for(int i = 1; i < nums.length; i++) {
    n[i - 1] = nums[i];
  }
  
  //add the first index of nums to the last index of n
  n[nums.length - 1] = nums[0];
  
  return n;
}
