/*
 * Given a map of food keys and topping values, modify and 
 * return the map as follows: if the key "ice cream" is 
 * present, set its value to "cherry". In all cases, set the 
 * key "bread" to have the value "butter".
 */
public Map<String, String> topping1(Map<String, String> map) {
  
  if(map.containsKey("ice cream")) {
    map.replace("ice cream", "cherry");
  }
  
  if(map.containsKey("bread")) {
    map.replace("bread", "butter");
  } else {
    map.put("bread", "butter");
  }
  
  return map;
  
}
