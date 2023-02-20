import Foundation

class Semordnilap {
    func semordnilap(_ words: [String]) -> [[String]] {
        var result: [[String]] = []
        var dictionaries: Dictionary<String, Integer> = [:]
        
        for index in stride(from: 0, to: words.count, by: 1) {
            let reversed = String(words[index].reversed())
            if let dictionary = dictionaries[reversed] {
                result.append([words[dictionary], words[index]])
            } else {
                dictionaries[words[index]] = index
            }
        }    
        
        return result;
    }
}