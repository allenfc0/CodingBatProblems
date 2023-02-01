public int[] fix23(int[] nums) {
  int[] changedArray = nums;
  
  for(int i = 0; i < changedArray.length; i++) {
    if(changedArray[i] == 2 && changedArray[i + 1] == 3) {
      changedArray[i + 1] = 0;
    }
  }
  
  return changedArray;
}
