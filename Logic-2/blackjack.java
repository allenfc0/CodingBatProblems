/*
 * Given 2 int values greater than 0, return whichever value 
 * is nearest to 21 without going over. Return 0 if they both 
 * go over.
 */

public int blackjack(int a, int b) {
  if(a <= 21 && b <= 21) {
    if(21 - a < 21 - b) {
      return a;
    }
    return b;
  } else if(a <= 21 && b > 21) {
    return a;
  } else if(b <= 21 && a > 21) {
    return b;
  }
  
  return 0;
}
