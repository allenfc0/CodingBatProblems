public boolean hasBad(String str) {
  if(str.startsWith("bad")) {
    return true;
  } else if(str.length() >= 4 && str.substring(1, 4).equals("bad")) {
    return true;
  }
  
  return false;
}
