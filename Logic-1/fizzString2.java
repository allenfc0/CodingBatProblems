
/*
 * Given an int n, return the string form of the number followed by 
 * "!". So the int 6 yields "6!". Except if the number is divisible by 
 * 3 use "Fizz" instead of the number, and if the number is divisible 
 * by 5 use "Buzz", and if divisible by both 3 and 5, use "FizzBuzz".
 */
public String fizzString2(int n) {
  
  String word = "";
  
  if(n % 3 == 0) {
    word += "Fizz";
  }
  
  if(n % 5 == 0) {
    word += "Buzz";
  }
  
  if(word.equals("")) {
    return String.format("%d!", n);
  }
  
  return word + "!";
  
}

