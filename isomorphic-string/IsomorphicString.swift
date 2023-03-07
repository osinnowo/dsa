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