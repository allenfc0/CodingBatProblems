public String stringX(String str) {
  String modString = "";
  int len = str.length();
  if(len < 2) return str;
  for(int i = 1; i < len-1; i++) {
    if(str.charAt(i) == 'x') continue;
    modString += str.charAt(i);
  }
  return str.charAt(0)+modString+str.charAt(len-1);
}
