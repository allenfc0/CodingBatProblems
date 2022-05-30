public int sumNumbers(String str) {
  String currentNumber = "";
  int sum = 0;
  
  for(int i = 0; i < str.length(); i++) {
    //check to see is index value is a number
    //then add string to currentNumber
    if(Character.isDigit(str.charAt(i))) {
      currentNumber+=str.charAt(i);
      //if index is at last and a digit, 
      //then add the currentNumber to nums
      if(i == str.length() - 1) {
        sum+=Integer.parseInt(currentNumber);
      }
    } 
    //if not a number check if currentNumber is not empty
    //then parse currentNumber and add to list
    else if(!currentNumber.equals("")) {
      sum+=Integer.parseInt(currentNumber);
      currentNumber = "";
    }
  }
  return sum;
}
