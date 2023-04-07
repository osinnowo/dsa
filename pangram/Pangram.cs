using System.Collections.Generic;

public class Pangram {
    public bool CheckIfPangram(String sentence) {
        HashSet<Character> set = new HashSet<>();
        for(int i = 0; i < sentence.Length; i++) {
            char character = sentence[i];
            if(!set.Contains(character) && Character.IsLetter(character)){
                set.Add(character);
            } 
        }
        return set.Count == 26;
    }
}
