public String mirrorEnds(String string) {
  String mirror = "";
  
  for(int i = 0; i < string.length(); i++) {
    if(string.charAt(i) == string.charAt(string.length() - 1 - i)) {
      mirror += string.charAt(i);
    } else {
      break;
    }
  }
  return mirror;
}
