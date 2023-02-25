import Foundation 

class FastSlowPointer{
    func fastSlowPointer(_ array: [Int]) -> Int {
        var slow = 0
        var fast = 0
        while fast + 1 < array.count {
            slow += 1
            fast += 2
        }
        return array[slow]
    }
}