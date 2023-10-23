
/*
 * Given a string str, if the string starts with "f" return 
 * "Fizz". If the string ends with "b" return "Buzz". If both 
 * the "f" and "b" conditions are true, return "FizzBuzz". In 
 * all other cases, return the string unchanged.
 */
 
public String fizzString(String str) {
  String word = "";
  
  if(Character.toLowerCase(str.charAt(0)) == 'f') {
    word += "Fizz";
  }
  if(Character.toLowerCase(str.charAt(str.length() - 1)) == 'b') {
    word += "Buzz";
  }
  
  if(word.isEmpty()) {
    return str;
  }
  
  return word;
}
