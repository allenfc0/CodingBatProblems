/*
 * Modify and return the given map as follows: if the key "a" 
 * has a value, set the key "b" to have that same value. In all 
 * cases remove the key "c", leaving the rest of the map unchanged.
 */

public Map<String, String> mapShare(Map<String, String> map) {
  Map<String, String> m = new HashMap<String, String>(map);
  
  if(m.containsKey("a")) {
    m.put("b", m.get("a"));
  }
  m.remove("c");
  
  return m;
}
