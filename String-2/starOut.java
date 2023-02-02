public String starOut(String str) {
  StringBuilder word = new StringBuilder();
  
  for(int i = 0; i < str.length(); i++) {
    //if a star => don't add
    if(str.charAt(i) == '*') continue;
    
    //if character is in front of star => don't add
    if(i > 0 && str.charAt(i - 1) == '*') continue;
    
    //if character is behind star => don't add
    if(i < str.length() - 1 && str.charAt(i + 1) == '*') continue;
    
    //add if above don't apply
    word.append(str.charAt(i));
  }
  
  return word.toString();
  
}
