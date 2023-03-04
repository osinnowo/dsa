class OneEdit {
  func oneEdit(_ stringOne: String, _ stringTwo: String) -> Bool {
    let lengthOne = stringOne.count
    let lengthTwo = stringTwo.count
    if(abs(lengthOne - lengthTwo) > 1) {
      return false
    }
    for i in 0..<min(lengthOne, lengthTwo) {
      let charOne = stringOne.index(stringOne.startIndex, offsetBy: i)
      let charTwo = stringTwo.index(stringOne.startIndex, offsetBy: i)
      if stringOne[charOne] != stringTwo[charTwo] {
        if lengthOne > lengthTwo {
          return stringOne.suffix(stringOne.count - (i + 1)) == stringTwo.suffix(stringTwo.count - i)
        } else if lengthTwo > lengthOne {
          return stringOne.suffix(stringOne.count - i) == stringTwo.suffix(stringTwo.count - (i + 1))
        } else {
          return stringOne.suffix(stringOne.count - (i + 1)) == stringTwo.suffix(stringTwo.count - (i + 1))
        }
      }
    }
    return true
  }
}
