import java.util.*;

class MajorityElement {
  public int MajorityElement(int[] array) {
    int majority = -1;
    Map<Integer, Integer> map = new HashMap<>();
    
    for(var item: array) {
      if(!map.containsKey(item)) {
        map.put(item, 1);
      } 
      map.put(item, map.getOrDefault(item, 0) + 1);
      int current = map.get(item);
      int last = map.getOrDefault(majority, 0);
      majority = current > last ? item : majority;
    }
    return majority;
  }
}