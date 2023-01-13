using System;
using System.Collections.Generic;

public class FirstNonRepeatingCharacter {
    public int FirstNonRepeatingCharacters1(string str) {
       	for(int i = 0; i < str.Length; i++) {
            bool isDuplicated = false;
            for(int j = 0; j < str.Length; j++) {
                if((i != j) && (str[i] == str[j])) {
                    isDuplicated = true;
                }
            }
            if(!isDuplicated) { return i ; }
        }
        return -1;
    }

    public int FirstNonRepeatingCharacters2(string str) {
        Dictionary<char, int> dictionary = new Dictionary<char, int>();
        foreach(var word in str) {
            dictionary[word] = dictionary.GetValueOrDefault(word) + 1;
        }
        for(int i = 0; i < str.Length; i++) {
            if(dictionary[str[i]] == 1) { return i; }
        }
        return -1;
    }
}