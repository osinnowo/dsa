/**
 * MIT License
 *
 * Copyright (c) 2023 Osinnowo Emmanuel
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of 
 * this software and associated documentation files (the "Software"), to deal in 
 * the Software without restriction, including without limitation the rights to 
 * use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies 
 * of the Software, and to permit persons to whom the Software is furnished to do 
 * so, subject to the following conditions:
 *
 * The above copyright notice and this permission notice shall be included in all 
 * copies or substantial portions of the Software.                                
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
 * IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS 
 * FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR 
 * COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER 
 * IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN 
 * CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.      
 *
 *   
 * ============================ 
 * Description:
 * ============================
 * 205. Isomorphic Strings:
 *
 * Given two strings s and t, determine if they are isomorphic.
 * Two strings s and t are isomorphic if the characters in s can be replaced to get t.
 * All occurrences of a character must be replaced with another character while preserving the 
 * order of characters. No two characters may map to the same character, but a character may map to itself.
 * 
 * Example I:
 * Input: s = "egg", t = "add"
 * Output: true
 * 
 * Example II:
 * Input: s = "foo", t = "bar"
 * Output: false
 *
 * Example III:
 * Input: s = "paper", t = "title"
 * Output: true
 **/

import java.util.*;

public class IsomorphicString {
    public boolean isIsomorphic1(String first, String second) {
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

    public boolean isIsomorphic2(String first, String second) {
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
