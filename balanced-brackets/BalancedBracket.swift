class BalancedBracket {
  func balancedBrackets(string: String) -> Bool {
    var result: [Character] = []
    var dictionary: [Character: Character] = [")":"(", "]":"[", "}":"{"]
    for index in 0 ..< string.count {
      let character = string[string.index(string.startIndex, offsetBy: index)]
      if character == "(" || character == "[" || character == "{" {
         result.append(character)
         continue
      }
      guard let item = dictionary[character] else { continue }
      if !result.isEmpty, result.last == item {
        result.popLast()
        continue
      } 
      
      return false
    }
    return result.isEmpty
  }
}
