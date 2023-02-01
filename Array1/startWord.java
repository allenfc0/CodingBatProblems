public String startWord(String str, String word) {
  if(word.length() == 1 && str.length() > 0) 
    return str.substring(0, 1);
    
  if(str.length() < 2) return "";
    
  if(word.substring(1, word.length())
    .equals(str.substring(1, word.length()))) {
      return str.substring(0, word.length());
  }
  
  return "";
}
