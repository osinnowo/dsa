import Foundation

class MidArrayElement {
    func midArrayElement(_ array: [Int]) -> Int {
        var slow = 0, fast = 0
        while slow < array.count, fast + 1 < array.count {
            slow += 1; fast += 2
        }
        return array[slow]!
    }
}