/*
 * Given two arrays of ints sorted in increasing order, outer 
 * and inner, return true if all of the numbers in inner appear 
 * in outer. The best solution makes only a single "linear" 
 * pass of both arrays, taking advantage of the fact that both 
 * arrays are already in sorted order.
 */

public boolean linearIn(int[] outer, int[] inner) {
  // take care of empty arrays
  if(outer.length == 0 || inner.length == 0) return true;
  
  // linear will remain false until checking inner values are
  // found in the outer values
  boolean linear = false;
  // counter will track the inner array in order to not go
  // out of bounds and check if it's the same length as the 
  // inner array
  int counter = 0;
  for(int i = 0; i < outer.length; i++) {
    if(outer[i] == inner[counter]) {
      counter++;
    }
    
    if(counter == inner.length) {
        linear = true;
        break;
    }
  }
  return linear;
}
