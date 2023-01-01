class Program {
  func twoNumberSum1(_ array: inout [Int], _ targetSum: Int) -> [Int] {
    for (key, value) in array.enumerated() {
      for (subKey, subValue) in array.enumerated() {
        if(key == subKey) { continue }
        let sum = value + subValue
        if(sum == targetSum) { return [value, subValue] }
      }
    }
    return []
  }

  func twoNumberSum2(_ array: inout [Int], _ targetSum: Int) -> [Int] {
    for i in stride(from: 0, to: array.count, by: 1) {
      for j in stride(from: i + 1, to: array.count, by: 1) {
        let sum = array[i] + array[j]
        if(sum == targetSum) { return [ array[i], array[j] ] }
      }
    }
    return []
  }

  func twoNumberSum3(_ array: inout [Int], _ targetSum: Int) -> [Int] {
    var set: Set<Int> = []
    var index = 0
    while(index < array.count) {
      let num = targetSum - array[index]
      if(set.contains(num)) { return [ array[index], num ] }
      set.insert(array[index])
      index += 1
    }
    return []
  }

  func twoNumberSum4(_ array: inout [Int], _ targetSum: Int) -> [Int] {
    var dictionary: [Int: Int] = [:]
    for num in array {
      let difference = targetSum - num
      if let contains = dictionary[difference] {
        return [ contains, difference ]
      }
      dictionary[num] = difference
    }
    return []
  }

  func twoNumberSum5(_ array: inout [Int], _ targetSum: Int) -> [Int] {
    array.sort()
    var left = 0
    var right = array.count - 1
    while(left < right){
      let sum = array[right] + array[left]
      if(sum == targetSum) {
        return [ array[right], array[left] ]
      } else if (sum < targetSum) {
        left += 1
      } else if (sum > targetSum) {
        right -= 1
      }
    }
    return []
  }
}