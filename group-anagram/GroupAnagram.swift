class GroupAnagram {
  func groupAnagrams(_ words: [String]) -> [[String]] {
    var dictionaries: [String: [String]] = [:]
    
    for word in words {
      let sorted = String(word.sorted())
      var array = dictionaries[sorted, default: []]
      array.append(word)
      dictionaries[sorted] = array
    }
    
    return Array(dictionaries.values)
  }
}
