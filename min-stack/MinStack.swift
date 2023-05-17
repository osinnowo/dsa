class MinStack {
    private var stack: [Int] = []
    private var minStack: [Int] = []

    init() {
        
    }
    
    func push(_ val: Int) {
        stack.append(val)
        
        if let min = minStack.last {
            minStack.append(Swift.min(min, val))
        } else {
            minStack.append(val)
        }
    }
    
    func pop() {
        stack.removeLast()
        minStack.removeLast()
    }
    
    func top() -> Int {
        return stack.last ?? 0
    }
    
    func getMin() -> Int {
        return minStack.last ?? 0
    }
}
