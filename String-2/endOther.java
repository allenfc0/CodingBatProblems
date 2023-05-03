public boolean endOther(String a, String b) {
  String word1 = a.toLowerCase();
  String word2 = b.toLowerCase();
  
  
  return word1.endsWith(word2) || word2.endsWith(word1);
    
}
