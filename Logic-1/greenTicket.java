public int greenTicket(int a, int b, int c) {
  int count = 0;
  
  if(a == b) count++;
  if(b == c) count++;
  if(c == a) count++;
  
  if(count == 3) return 20;
  if(count == 2) return 10;
  return 0;
}
