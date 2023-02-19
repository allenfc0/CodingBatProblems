public int maxBlock(String str) {
  
  //exception len is 0
  if(str.length() == 0) return 0;
  
  //keep count of current run for char
  int run = 0,
  //keep count of the biggest run for char
  maxRun = 0;
  
  //keep track of current char in loop
  String current = str.charAt(0) + "";
  
  for(String s : str.split("")) {
    
    //if current char is equal to the current index char
    //then add 1 to run and immediately check if it beats maxRun
    if(s.equals(current)) {
      run++;
      maxRun = (maxRun < run) ? run : maxRun;
      continue;
    }
    //if char changes then update current char
    //and set run to 1 since next iteration is a new char
    current = s;
    run = 1;
  }
  
  return maxRun;
}
