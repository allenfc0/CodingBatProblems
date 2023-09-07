/*
 * Given a string, return a version without the first 2 chars. 
 * Except keep the first char if it is 'a' and keep the second 
 * char if it is 'b'. The string may be any length.
 */

public String deFront(String str) {    
  if(str.length() < 2) return str;
  
  String word = "";
  
  if(str.charAt(0) == 'a') {
    word += 'a';
  }
  if(str.charAt(1) == 'b') {
    word += 'b';
  }
  
  return word + str.substring(2, str.length());
}
