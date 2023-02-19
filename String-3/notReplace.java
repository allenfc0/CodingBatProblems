public String notReplace(String str) {
  //add space at the beggining of str
  String s = " " + str + " ";
  //store result
  String res = "";
  //go through s starting at index 1 
  //and end before 'is' is possible
  for(int i = 1; i < s.length() - 1; i++) {
    //check if "is" is a stand-alone substring
    if(!Character.isLetter(s.charAt(i - 1)) &&
        s.substring(i, i + 2).equals("is") &&
        !Character.isLetter(s.charAt(i + 2))) {
          //add is not to the res
          res += "is not";
          //skip 's' since it got replaced
          i++;
          continue;
        }
    //add current character index if "is" is not found
    res += s.charAt(i) + "";
  }
  return res;
}
