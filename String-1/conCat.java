public String conCat(String a, String b) {
  
  if(a.equals("") || b.equals("")) return a + b;
  
  Character charA = a.charAt(a.length() - 1);
  Character charB = b.charAt(0);
  
  if(charA == charB) {
    return a + b.substring(1, b.length());
  }
  
  return a + b;
}
