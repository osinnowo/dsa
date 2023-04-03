import Foundation

class StackQueue {

    private var array: [Int] = []

    public init() { }

    func push(_ x: Int) {
        array.append(x)
    }
    
    func pop() -> Int {
        return array.removeLast()
    }
    
    func top() -> Int {
        return array[array.count - 1]
    }
    
    func empty() -> Bool {
        return array.isEmpty
    }
}