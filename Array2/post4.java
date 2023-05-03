public int[] post4(int[] nums) {
  
  // index captures where to start copying the array from
  int startIndex = 0;
  
  //iterate through array, start adding to the array
  for(int i = 0; i < nums.length; i++) {
    //check that the nums[i] is not a 4
    if(nums[i] == 4) {
      // get the index for when there's no more 4s
      startIndex = i + 1;
    }
  }
  
  //declare and initialize array by copying
  int post4[] = Arrays.copyOfRange(nums, startIndex, nums.length);
  
  return post4;
  
}
