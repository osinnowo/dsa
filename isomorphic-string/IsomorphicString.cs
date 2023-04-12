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

using System;
using System.Collections.Generic;

public class IsomorphicString {
    public bool IsIsomorphic1(string first, string second) {
        if(first == null || second == null) { return false; }
        if(first.Length != second.Length) { return false; }
        if(first.Length == 0 && second.Length == 0) { return true; }
        if(first.Equals(second)) { return true; }

        Dictionary<Char, Char> dictionary = new Dictionary<Char, Char>();

        for(int i = 0; i < first.Length; i++) {
            Char charOne = first[i];
            Char charTwo = second[i];
            Char? character = getKey(dictionary, charTwo);

            if(character != null && character != charOne) {
                return false;
            } else if(dictionary.ContainsKey(charOne)){
                if(charTwo != dictionary[charOne]) return false;
            } else {
                dictionary[charOne] = charTwo;
            }
        }
        return true;
    }

    public bool IsIsomorphic2(string first, string second) {
        Dictionary<Char, Char> dictionary = new Dictionary<Char, Char>();

        for(int i = 0; i < first.Length; i++) {
            Char key = first[i];
            Char value = second[i];

            KeyValuePair<Char, Char>? entry = searchEntry(key, value, dictionary);

            if(entry != null) {
                if(key == entry?.Key && value != entry?.Value) {
                    return false;
                } else if (key != entry?.Key && value == entry?.Value) {
                    return false;
                }
            } else {
                dictionary[key] = value;
            }
        }
        return true;
    }

    public KeyValuePair<Char, Char>? searchEntry (Char key, Char value, Dictionary<Char, Char> dictionary) {
        foreach(KeyValuePair<Char, Char> entry in dictionary) {
            if(entry.Key == key || entry.Value == value || entry.Key == value || entry.Value == value) {
               return entry;
            }
        }
        return null;
    }

    public Char? getKey(Dictionary<Char, Char> dictionary, Char character) {
        foreach(KeyValuePair<Char, Char> entry in dictionary) {
            if(entry.Value.Equals(character)) { return entry.Key; }
        }
        return null;
    }
}
