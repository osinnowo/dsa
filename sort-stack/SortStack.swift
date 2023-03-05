class SortStack {
  func sortStack(_ stack: inout [Int]) -> [Int] {
    if stack.count == 0 {
      return stack
    }
    let top = stack.removeLast()
    sortStack(&stack)

    insertInSortedOrder(&stack, top)
    return stack
  }

  func insertInSortedOrder(_ stack: inout [Int], _ value: Int) {
    if stack.count == 0 || stack[stack.count - 1] <= value {
      stack.append(value)
      return
    }
    let top = stack.removeLast()
    insertInSortedOrder(&stack, value)
    stack.append(top)
  }
}