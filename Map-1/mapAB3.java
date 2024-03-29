/*
 * Modify and return the given map as follows: if exactly one of 
 * the keys "a" or "b" has a value in the map (but not both), set 
 * the other to have that same value in the map.
 */

public Map<String, String> mapAB3(Map<String, String> map) {
  
  if(map.containsKey("a") && map.containsKey("b")) {
    return map;
  }
  if(map.containsKey("a") && !map.containsKey("b")) {
    map.put("b", map.get("a"));
  } else if(map.containsKey("b") && !map.containsKey("a")) {
    map.put("a", map.get("b"));
  }
  return map;
}
