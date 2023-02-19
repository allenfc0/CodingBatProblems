public boolean makeBricks(int small, int big, int goal) {
  int breakDown = goal;
  
  //getting rid of my big bricks
  // needed           have
  if(breakDown / 5 >= big) {
    breakDown -= big*5;
  } else if(breakDown / 5 < big) {
    breakDown %= 5*(breakDown / 5);
  }
  
  if(breakDown <= small) {
    return true;
  }
  return false;
  
  
}
