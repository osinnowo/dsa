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
 * 
 **/

var isomorphicString1 = function(first, second) {
    if(first === null || second === null) { return false; }
    if(first.length !== second.length) { return false; }
    if(first.length === 0 && second.length === 0) { return true; }
    if(first === second) { return true; }

    let map = new Map();

    for(let i = 0; i < first.length; i++) {
        let charOne = first[i];
        let charTwo = second[i];
        let character = getKey(map, charTwo);

        if(character !== null && character !== charOne) {
            return false;
        } else if(map.has(charOne)){
            if(charTwo != map.get(charOne)) { return false; }
        } else {
            map.set(charOne, charTwo);
        }
    }
    return true;
};

var isomorphicString2 = function(first, second) { 
    var map = new Map();
    for (let i = 0; i < first.length; i++) {
        let key = first.charAt(i);
        let value = second.charAt(i);
        let entry = searchEntry(key, value, map);
        if (entry !== null) {
            if (key === entry.key && value !== entry.value) {
                return false;
            } else if (key !== entry.key && value === entry.value) {
                return false;
            }
        } else {
            map.set(key, value);
        }
    }
    return true;
}

var searchEntry = function(k, v, map) {
    for (const [key, value] of map.entries()) {
        if (key === k || value === v || key === v || value === v) {
            return { key, value };
        }
    }
    return null;
}

var getKey = function(map, character) {
    for(const [key, value] of map.entries()) {
        if(value === character) { return key; }
    }
    return null;
}