public int[] midThree(int[] nums) {
  
  //new array length 3
  int[] middle = new int[3];
  
  middle[0] = nums[(nums.length / 2) - 1];
  middle[1] = nums[(nums.length / 2)];
  middle[2] = nums[(nums.length / 2) + 1];
  
  return middle;
}
