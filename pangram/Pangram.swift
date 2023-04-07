import Foundation

class Pangram {
    func checkIfPangram(_ sentence: String) -> Bool {
        var set: Set<Character> = []
        for character in sentence {
            if !set.contains(character), character.isLetter {
                set.insert(character)
            }
        }
        return set.count == 26
    }
}