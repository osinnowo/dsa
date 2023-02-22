import Foundation

class NextGreaterElement {
      func nextGreaterElement(_ array: [Int]) -> [Int] {
        var result = Array(repeating: -1, count: array.count)
        var stack = [Int]()

        for idx in stride(from: 0, to: 2 * array.count, by: 1) {
        let circularIdx = idx % array.count
        
        while stack.count > 0, array[stack[stack.count - 1]] < array[circularIdx] {
            let top = stack.popLast()!
            result[top] = array[circularIdx]
        }
        stack.append(circularIdx)
        }
        return result
    }
}