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
 
import Foundation

class Isomorphic {
    typealias Entry = (key: Character, value: Character)
    
    func isIsomorphic1(_ first: String, _ second: String) -> Bool {
        if(first.count == 0 || second.count == 0) { return false }
        if(first.count != second.count) { return false }
        if(first == second) { return true }
        if(first.count == 1 && second.count == 1) { return true }
        
        var dictionary: [Character: Character] = [:]
        var firstArray = Array(first)
        var secondArray = Array(second)

        for (index, charOne) in firstArray.enumerated() {
            var charTwo: Character = secondArray[index]
            var character: Character? = getKey(dictionary, charTwo)
            if(character != nil && character! != charOne) {
                return false
            }
            
            if let containChar = dictionary[charOne] {
                if(containChar != charTwo) { return false }
            }
            
            dictionary[charOne] = charTwo
        }
        return true
    }

    func isIsomorphic2(_ first: String, _ second: String) -> Bool {
        var items: [Character: Character] = [:]
        
        for index in 0 ..< first.count {
            var key = first[first.index(first.startIndex, offsetBy: index)]
            var value = second[second.index(second.startIndex, offsetBy: index)]
            var entry: Entry? = searchEntry(key, value, items)
            
            if let entry = entry {
                if(entry.key == key && entry.value != value) {
                    return false
                } else if (entry.key != key && entry.value == value) {
                    return false
                }
            } else {
                items[key] = value
            }
        }
        return true
    }

    func searchEntry(_ key: Character, _ value: Character, _ items: [Character: Character]) -> Entry? {
        for item in items {
            if(item.key == key || item.key == value || item.value == key || item.value == value) {
                return item
            }
        }
        return nil
    }

    func getKey(_ dictionary: [Character: Character], _ value: Character) -> Character? {
        for dict in dictionary {
            if(dict.value == value) { return dict.key }
        }
        return nil
    }
}