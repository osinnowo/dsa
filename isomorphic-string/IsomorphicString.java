import java.util.*;

public class IsomorphicString {
    // foo -> bar
    // add -> egg
    public boolean IsIsomorphic1(String first, String second) {
        if(first == null || second == null) { return false; }
        if(first.length() != second.length()) { return false; }
        if(first.length() == 0 && second.length() == 0) { return true; }
        if(first.equals(second)) { return true; }

        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < first.length(); i++) {
            Character charOne = first.charAt(i);
            Character charTwo = second.charAt(i);
            Character character = getKey(map, charTwo);

            if(character != null && character != charOne) {
                return false;
            } else if(map.containsKey(charOne)){
                if(charTwo != map.get(charOne)) return false;
            } else {
                map.put(charOne, charTwo);
            }
        }

        return true;
    }

    public boolean IsIsomorphic2(String first, String second) {
        Map<Character, Character> map = new HashMap<>();

        for(int i = 0; i < first.length(); i++) {
            Character key = first.charAt(i);
            Character value = second.charAt(i);
            Map.Entry<Character, Character> entry = searchEntry(key, value, map);

            if(entry != null) {
                if(key == entry.getKey() && value != entry.getValue()) {
                    return false;
                } else if (key != entry.getKey() && value == entry.getValue()) {
                    return false;
                }
            } else {
                map.put(key, value);
            }
        }
        return true;
    }

    public Map.Entry<Character, Character> searchEntry (Character key, Character value, Map<Character, Character> map) {
        for(var entry: map.entrySet()) {
            if(entry.getKey() == key || entry.getValue() == value || entry.getKey() == value || entry.getValue() == value) {
               return entry;
            }
        }
        return null;
    }

    public Character getKey(Map<Character, Character> map, Character character) {
        for(Map.Entry<Character, Character> entry: map.entrySet()) {
            if(entry.getValue().equals(character)) { return entry.getKey(); }
        }
        return null;
    }
}
