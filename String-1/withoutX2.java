/*
 * Given a string, if one or both of the first 2 chars is 'x', 
 * return the string without those 'x' chars, and otherwise 
 * return the string unchanged.
 */

public String withoutX2(String str) {
  
  String w = "";
  
  if(str.length() > 0 && str.charAt(0) != 'x') {
    w += str.charAt(0);
  }
  if(str.length() > 1 && str.charAt(1) != 'x') {
    w += str.charAt(1);
  }
  
  if(str.length() < 2) return w;
  
  return w + str.substring(2, str.length());
}
