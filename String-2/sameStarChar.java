public boolean sameStarChar(String str) {
  if(str.length() <= 1) {
    return true;
  }
  
  
  for(int i = 1; i < str.length() - 1; i++) {
    if(str.charAt(i) == '*') {
      
      char letter = str.charAt(i - 1);
      if(letter != str.charAt(i + 1)) return false;
    }
  }
  return true;
}
