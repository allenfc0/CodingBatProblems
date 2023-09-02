public boolean nearTen(int num) {
  //12 % 10 = 2 || 18 % 10 = 8
  if(num % 10 <= 2 || num % 10 >= 8) return true;
  
  return false;
}
