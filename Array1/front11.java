
/*
 * Given 2 int arrays, a and b, of any length, return a new 
 * array with the first element of each array. If either array 
 * is length 0, ignore that array.
 */

public int[] front11(int[] a, int[] b) {
  ArrayList<Integer> list = new ArrayList<Integer>();
  
  if(a.length > 0) list.add(a[0]);
  if(b.length > 0) list.add(b[0]);
  
  int[] arr = list.stream().mapToInt(i -> i).toArray();
  return arr;
}
