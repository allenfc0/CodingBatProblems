/*
 * Modify and return the given map as follows: if the keys "a" 
 * and "b" are both in the map and have equal values, remove them 
 * both.
 */

public Map<String, String> mapAB2(Map<String, String> map) {
  
  Map<String, String> m = new HashMap<String, String>(map);
  
  if((m.containsKey("a") && m.containsKey("b")) && 
      m.get("a").equals(m.get("b"))) {
    m.remove("a");
    m.remove("b");
  }
  
  return m;
}
