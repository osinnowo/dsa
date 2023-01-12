import Foundation

class FirstNonRepeatingCharacter {
    public func firstNonRepeatingCharacter(_ string: String) -> Int {
        let characters = Array(string)
        for i in stride(from: 0, to: characters.count, by: 1) {
            var isDuplicated = true
            for j in stride(from: 0, to: characters.count, by: 1) {
                if((i != j) && (characters[i]) == characters[j]) {
                    isDuplicated = false
                }
            }
            if(isDuplicated) { return i }
        }
        return -1;
    }

    public func firstNonRepeatingCharacter2(_ string: String) -> Int {
       let characters = Array(string)
       var dictionaries: [Character: Int] = [:]
       for index in stride(from: 0, to: characters.count, by: 1) {
            dictionaries[characters[index]] = dictionaries[characters[index]] == nil ? 0 : dictionaries[characters[index]]! + 1
       } 
       for (index, character) in characters.enumerated() {
            if(dictionaries[character] == 0) { return index }
       }
       return -1
    }
}