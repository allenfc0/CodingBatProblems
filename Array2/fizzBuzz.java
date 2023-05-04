public String[] fizzBuzz(int start, int end) {
  
  //    Requirements
  // multiples of 3 is Fizz
  // multiples of 5 is Buzz
  // Both FizzBuzz
  
  // declare and instantiate String array
  // length is the difference from end to start
  String post[] = new String[end - start];
  
  // catch the word fizz and/or buzz to eliminate one
  // if statement
  String word = "";
  
  //counter index for post array 
  int counter = 0;
  
  // iterate through the parameters (not including end)
  for(int i = start; i < end; i++) {
    // checking for 3s
    if(i % 3 == 0) {
      word += "Fizz";
    }
    //checking for 5s
    if(i % 5 == 0) {
      word += "Buzz";
    }
    // not multiple of both 
    if(i % 3 != 0 && i % 5 != 0) {
      word += i;
    }
    // add the created String to the array
    post[counter] = word;
    
    //post index must increase
    counter++;
    
    //reset word;
    word = "";
  }
  
  return post;
}
