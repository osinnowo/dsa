import Foundation

class ReversePolishNotation {
    func reversePolishNotation(_ notations: [String]) -> Int {
        var result = 0;
        var stack = [Int]()
        var operators = "+-*/"
        for notation in notations {
            if !operators.contains(notation) {
                stack.append(notation); continue
            }
            var first = stack.popLast()
            var second = stack.popLast()

            var index: Int = operators.firstIndex(of: notation)

            switch index! {
                case 0:
                    result = first + second                
                case 1:
                    result = first - second
                case 2:
                    result = first * second
                default:
                    result = first / second
            }
            stack.append(result)
        }
        return result;
    }
}