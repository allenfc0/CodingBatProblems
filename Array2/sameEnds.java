public boolean sameEnds(int[] nums, int len) {
  
  for(int i = 0; i < len; i++) {
    if(nums[i] != nums[i + nums.length - len]) return false;
    
    if(i > len - 1) return true;
  }
  
  return true;
}
