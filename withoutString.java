public String withoutString(String base, String remove) {
  String word = "";
  
  //go through every iteration in order to add every letter
  for(int i = 0; i < base.length(); i++) {
    //if the remove String length can't fit in the current index
    //then add the character at i to the word
    //if it does fit check for matches (in lowercase)
    if(i <= base.length() - remove.length() 
      && base.substring(
        i, i+remove.length()).toLowerCase().equals(remove.toLowerCase())
        ) {
      i+=remove.length() - 1;
      continue;
    }
    word+=base.charAt(i);
  }
  return word;
}
