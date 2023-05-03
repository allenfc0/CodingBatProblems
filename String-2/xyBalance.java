public boolean xyBalance(String str) {
  
  //determines whether there's a match.
  //instantiated true because of conditions
  boolean balanced = true;
  
  //iterate through string with for loop
  for(int i = 0; i < str.length(); i++) {
    if(str.charAt(i) == 'x') balanced = false;
    else if(str.charAt(i) == 'y') balanced = true;
  }
  
  return balanced;
}
