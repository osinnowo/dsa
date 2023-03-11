class ProductSum {
  func productSum(_ array: [Any], _ multiplier: Int = 1) -> Int {
    var sum = 0
    for element in array {
      if let elementAsArray = element as? [Any] {
        sum += productSum(elementAsArray, multiplier + 1) 
      } else if let elementAsInt = element as? Int {
        sum += elementAsInt
      }
    }
    return sum * multiplier
  }
}
