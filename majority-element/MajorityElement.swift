class MajorityElement {
  func majorityElement(_ array: [Int]) -> Int {
    var majority = -1
    var dictionary: [Int: Int] = [:]

    for item in array {
       dictionary[item] = dictionary[item, default: 0] + 1
       var current = dictionary[item]
       var last = dictionary[majority, default: 0]
       majority = current! > last ? item : majority
    }
    
    return majority
  }
}