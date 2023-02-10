public int[] makeMiddle(int[] nums) {
  int[] middle = new int[2];
  
  middle[0] = nums[(nums.length / 2) - 1];
  middle[1] = nums[(nums.length / 2)];
  
  return middle;
}
