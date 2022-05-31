public int countTriple(String str) {
  int counter = 0;
  
  //iterate through the wole string
  for(int i = 0; i < str.length() - 2; i++) {
    //get the letter in question 
    char letter = str.charAt(i);
    //add +1 init for loop as char at index is taken
    for(int j = i + 1; j < i + 3; j++) {
      if(letter != str.charAt(j)) {
        break;
      }
      if(j == i + 2) counter++;
    }
  }
  return counter;
}
