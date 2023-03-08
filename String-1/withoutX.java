public String withoutX(String str) {
  StringBuilder sb = new StringBuilder(str);
  if(sb.length() < 1) return "";
  
  if(sb.charAt(0) == 'x') {
    sb.deleteCharAt(0);
  }
  if(sb.length() > 0 && sb.charAt(sb.length() - 1) == 'x') {
    sb.deleteCharAt(sb.length() - 1);
  }
  
  return sb.toString();
}
