/*
 * Given a string and an int n, return a string made of 
 * the first n characters of the string, followed by the 
 * first n-1 characters of the string, and so on. You may 
 * assume that n is between 0 and the length of the string, 
 * inclusive (i.e. n >= 0 and n <= str.length()).
 */

public String repeatFront(String str, int n) {
  
  // get the word to iterate through
  String word = str.substring(0, n);
  // get the original length because the word String variable will
  // keep increasing while in the loop
  int oLen = word.length();
  
  // iterate through word variable, start at 1 because we got the
  // first iteration
  for(int i = 1; i < n; i++) {
    // the oLen needs to decrease in length by 1 by each iteration
    word += word.substring(0, oLen - i);
  }
  
  return word;
}
