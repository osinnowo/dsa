class SortedSquare {
  func sortedSquared(_ array: [Int]) -> [Int] {
    var sequence = array
    for index in stride(from: 0, to: sequence.count, by: 1) {
      sequence[index] *= sequence[index]
    }
    return sequence.sorted()
  }
}
