import java.util.*;

class GroupAnagram {
  public static ArrayList<List<String>> groupAnagrams(List<String> words) {
    Map<String, List<String>> map = new HashMap<>();
    for(int i = 0; i < words.size(); i++) {
      String word = sortString(words.get(i));
      if(!map.containsKey(word)) {
        map.put(word, new ArrayList<String>(Arrays.asList(words.get(i))));
      } else {
        map.get(word).add(words.get(i));
      }
    }
    return new ArrayList<>(map.values());
  }
  
  public static String sortString(String str) {
    char[] characters = str.toCharArray();
    Arrays.sort(characters);
    return new String(characters);
  }
}
