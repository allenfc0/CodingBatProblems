
/*
 * Given an array of ints, swap the first and last elements in 
 * the array. Return the modified array. The array length will 
 * be at least 1.
 */
public int[] swapEnds(int[] nums) {
  int hold = nums[nums.length - 1];
  nums[nums.length - 1] = nums[0];
  nums[0] = hold;
  
  return nums;
}
