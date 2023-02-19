public boolean frontAgain(String str) {
  
  if(str.length() > 1 && str.endsWith(str.substring(0, 2))) {
    return true;
  }
  return false;
}
