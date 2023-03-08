public String without2(String str) {
  if(str .length() > 1 && 
  str.startsWith(str.substring(str.length() - 2, str.length()))) {
    return str.substring(2, str.length());
  }
  return str;
}
