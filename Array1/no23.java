public boolean no23(int[] nums) {
  //checking 2 and 3
  for(int x = 2; x < 4; x++) {
    for(int y : nums) {
      if(x == y) return false;
    }
  }
  return true;
}
