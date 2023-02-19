import java.util.*;

class GroupAnagram {
  public static ArrayList<List<String>> groupAnagrams(List<String> words) {
    Map<String, List<String>> map = new HashMap<>();
    for(var word: words) {
      char[] characters = word.toCharArray(); Arrays.sort(characters);
      String sortedWord = new String(characters);
      if(!map.containsKey(sortedWord)) {
        map.put(sortedWord, new ArrayList<String>(Arrays.asList(word)));
      } else {
        map.get(sortedWord).add(word);
      }
    }
    return new ArrayList<>(map.values());
  }
}
