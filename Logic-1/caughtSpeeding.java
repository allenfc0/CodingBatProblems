public int caughtSpeeding(int speed, boolean isBirthday) {
  int result = 0;
  int lean = (isBirthday) ? 5 : 0;
  
  
  if(speed <= 80 + lean && speed >= 61 + lean) {
    result++;
  } else if(speed > 80 + lean) {
    result+=2;
  }
  
  return result;
  
}
