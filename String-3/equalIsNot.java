public boolean equalIsNot(String str) {
  int isApp = 0;
  int notApp = 0;
  
  //len - 1 covers is appearence but not "not"
  for(int i = 0; i < str.length() - 1; i++) {
    //checking if "is" appears
    if(str.substring(i, i + 2).equals("is")) {
      isApp++;
    }
    //check if "not" can be reached
    else if(str.length() - i >= 3 && str.substring(i, i + 3).equals("not")) {
      notApp++;
    }
  }
  if(isApp == notApp) return true;
  return false;
}
