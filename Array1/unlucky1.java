public boolean unlucky1(int[] nums) {
  //outliers can only be 1 length or below
  if(nums.length < 2) return false;
  
  //sequence 1 -> 3 is unlucky and returns true
  //Also, can only be unluck if index is first 2 or last 2 places
  if(nums[0] == 1 && nums[1] == 3) {
    return true;
  } else if(nums[1] == 1 && nums[2] == 3) {
    return true;
  } else if(nums[nums.length - 2] == 1 && nums[nums.length - 1] == 3) {
    return true;
  }
  
  
  return false;
}
