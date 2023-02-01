import Foundation

class Isomorphic {
    // add -> egg
    // foo -> bar
    func isIsomorphic(_ first: String, _ second: String) -> Bool {
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

    func getKey(_ dictionary: [Character: Character], _ value: Character) -> Character? {
        for dict in dictionary {
            if(dict.value == value) { return dict.key }
        }
        return nil
    }
}