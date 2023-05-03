public int[] withoutTen(int[] nums) {
  // will hold the new array
  int post[] = new int[nums.length];
  
  // create index for new array
  int postIndex = 0;
  
  // iterate through nums
  for(int i = 0; i < nums.length; i++) { 
    // check to see if nums[i] is 10
    if(nums[i] != 10){
      // add to post and increment post array index
      post[postIndex] = nums[i];
      postIndex++;
    }
  }
  
  return post;
  
}
